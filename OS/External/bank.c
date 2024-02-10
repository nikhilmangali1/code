#include<stdio.h>

int main() {
    int p, r;
    printf("\nEnter no.of process :");
    scanf("%d", &p);
    printf("\nEnter no.of Resources :");
    scanf("%d", &r);
    int maximum[p][r];
    int available[r];
    int allocated[p][r];
    int need[p][r];
    int finish[p]; // To track if a process has finished or not

    printf("\nEnter no.of resources allocated to each process :");
    for(int i = 0; i < p; i++) {
        for(int j = 0; j < r; j++) {
            scanf("%d", &allocated[i][j]);
        }
    }

    printf("\nEnter no.of resources available:");
    for(int i = 0; i < r; i++) {
        scanf("%d", &available[i]);
    }

    printf("\nEnter maximum resources needed for each process to execute :");
    for(int i = 0; i < p; i++) {
        for(int j = 0; j < r; j++) {
            scanf("%d", &maximum[i][j]);
        }
    }

    
    for(int i = 0; i < p; i++) {
        for(int j = 0; j < r; j++) {
            need[i][j] = maximum[i][j] - allocated[i][j];
        }
    }

    // Initialize all processes as unfinished
    for(int i = 0; i < p; i++) {
        finish[i] = 0;
    }

    int safe_sequence[p];
    int count = 0;

    // Find a safe sequence
    while (count < p) {
        int found = 0;
        for(int i = 0; i < p; i++) {
            if (finish[i] == 0) {
                int j;
                for (j = 0; j < r; j++) {
                    if (need[i][j] > available[j])
                        break;
                }
                if (j == r) {
                    // Process i can be completed
                    for (int k = 0; k < r; k++) {
                        available[k] += allocated[i][k];
                    }
                    safe_sequence[count] = i;
                    finish[i] = 1;
                    count++;
                    found = 1;
                }
            }
        }
        if (!found) {
            printf("\nUnsafe State: No safe sequence exists.\n");
            break;
        }
    }

    if (count == p) {
        printf("\nSafe Sequence: ");
        for (int i = 0; i < p; i++) {
            printf("P%d", safe_sequence[i]);
            if (i != p - 1) {
                printf(" -> ");
            }
        }
        printf("\n");
    }

    return 0;
}
