#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include<stdlib.h>

#define NUM_PHILOSOPHERS 5

pthread_mutex_t forks[NUM_PHILOSOPHERS];
pthread_t philosophers[NUM_PHILOSOPHERS];

#define lock_forks(id) \
    pthread_mutex_lock(&forks[id]); \
    pthread_mutex_lock(&forks[(id + 1) % NUM_PHILOSOPHERS])

#define unlock_forks(id) \
    pthread_mutex_unlock(&forks[id]); \
    pthread_mutex_unlock(&forks[(id + 1) % NUM_PHILOSOPHERS])

void* philosopher(void* arg) {
    int id = *(int*)arg;
    
    while (1) {
        printf("Philosopher %d is thinking.\n", id);
        sleep(1);
        
        printf("Philosopher %d is hungry.\n", id);
        
        lock_forks(id);
        
        printf("Philosopher %d is eating.\n", id);
        sleep(1);
        
        unlock_forks(id);
    }
    
    return NULL;
}

int main() {
    for (int i = 0; i < NUM_PHILOSOPHERS; ++i) {
        pthread_mutex_init(&forks[i], NULL);
        int* id = malloc(sizeof(int));
        *id = i;
        pthread_create(&philosophers[i], NULL, philosopher, id);
    }
    
    for (int i = 0; i < NUM_PHILOSOPHERS; ++i) {
        pthread_join(philosophers[i], NULL);
        pthread_mutex_destroy(&forks[i]);
    }
    
    return 0;
}
