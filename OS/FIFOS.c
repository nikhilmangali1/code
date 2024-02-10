#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

#define FIFO_PATH "/tmp/my_fifo"
#define BUFFER_SIZE 256

void child_process(int fd) {
    char message[BUFFER_SIZE];
    ssize_t bytes_read;

    printf("Child is reading from the FIFO...\n");

    bytes_read = read(fd, message, BUFFER_SIZE);
    if (bytes_read == -1) {
        perror("read");
        exit(EXIT_FAILURE);
    }

    message[bytes_read] = '\0';
    printf("Child received: %s\n", message);

    close(fd);
}

void parent_process(int fd) {
    printf("Parent is writing to the FIFO...\n");

    const char *parent_message = "Hello, child!";
    ssize_t bytes_written = write(fd, parent_message, strlen(parent_message));

    if (bytes_written == -1) {
        perror("write");
        exit(EXIT_FAILURE);
    }

    close(fd);
}

int main() {
    int fd;
    pid_t child_pid;

    if (mkfifo(FIFO_PATH, 0666) == -1) {
        perror("mkfifo");
        exit(EXIT_FAILURE);
    }

    if ((child_pid = fork()) == -1) {
        perror("fork");
        exit(EXIT_FAILURE);
    }

    fd = open(FIFO_PATH, (child_pid == 0) ? O_RDONLY : O_WRONLY);
    if (fd == -1) {
        perror("open");
        exit(EXIT_FAILURE);
    }

    if (child_pid == 0) {
        child_process(fd);
    } else {
        parent_process(fd);
    }

    unlink(FIFO_PATH);

    return 0;
}
