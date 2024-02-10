#include <stdio.h>


int main() {
    int count, totalTAT = 0, totalWT = 0, avgTAT = 0, avgWT = 0;
    printf("Enter no.of processes: ");
    scanf("%d", &count);

    int p[count];
    int at[count]; // Arrival times
    int bt[count]; // Burst times
    int remaining_bt[count];
    int wt[count];
    int tat[count];
    int TIME_QUANTUM=0;
    printf("ENter time slice");
    scanf("%d",&TIME_QUANTUM);

    printf("Enter Arrival Time of each process:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &at[i]);
        p[i] = i + 1;
    }

    printf("Enter Burst Time of each process:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &bt[i]);
        remaining_bt[i] = bt[i];
    }

    int time = 0;
    int completed = 0;
    int current = 0; // Index of the currently executing process

    while (completed < count) {
        if (remaining_bt[current] > 0) {
            if (remaining_bt[current] > TIME_QUANTUM) {
                time += TIME_QUANTUM;
                remaining_bt[current] -= TIME_QUANTUM;
            } else {
                time += remaining_bt[current];
                wt[current] = time - bt[current] - at[current];
                remaining_bt[current] = 0;
                completed++;
            }
        }

        // Move to the next process with the smallest arrival time that is not yet completed
        int next = (current + 1) % count;
        while (next != current && at[next] > time)
            next = (next + 1) % count;

        current = next;
    }

    for (int i = 0; i < count; i++) {
        tat[i] = bt[i] + wt[i];
        totalTAT += tat[i];
        totalWT += wt[i];
    }

    avgTAT = totalTAT / count;
    avgWT = totalWT / count;

    printf("Processes\tArrivalTime\tBurstTimes\tWaitingTime\tTurnAroundTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i], at[i], bt[i], wt[i], tat[i]);
    }

    printf("\nAverage Turn Around Time = %d", avgTAT);
    printf("\nAverage Waiting Time = %d", avgWT);

    return 0;
}
