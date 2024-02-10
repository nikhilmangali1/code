#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#define BUFFER_SIZE 256

void child_process(int pipe_fd[2]) {
    close(pipe_fd[1]); // Close the write end of the pipe in the child
    printf("Child is reading from the pipe...\n");

    char message[BUFFER_SIZE];
    ssize_t bytes_read = read(pipe_fd[0], message, BUFFER_SIZE);

    if (bytes_read == -1) {
        perror("read");
        exit(EXIT_FAILURE);
    }

    message[bytes_read] = '\0';
    printf("Child received: %s\n", message);

    close(pipe_fd[0]); // Close the read end of the pipe in the child
}

void parent_process(int pipe_fd[2]) {
    close(pipe_fd[0]); // Close the read end of the pipe in the parent
    printf("Parent is writing to the pipe...\n");

    const char *parent_message = "Hello, child!";
    ssize_t bytes_written = write(pipe_fd[1], parent_message, strlen(parent_message));

    if (bytes_written == -1) {
        perror("write");
        exit(EXIT_FAILURE);
    }

    close(pipe_fd[1]); // Close the write end of the pipe in the parent
}

int main() {
    int pipe_fd[2];
    pid_t child_pid;

    if (pipe(pipe_fd) == -1) {
        perror("pipe");
        exit(EXIT_FAILURE);
    }

    if ((child_pid = fork()) == -1) {
        perror("fork");
        exit(EXIT_FAILURE);
    }

    if (child_pid == 0) {
        child_process(pipe_fd);
    } else {
        parent_process(pipe_fd);
    }

    return 0;
}
