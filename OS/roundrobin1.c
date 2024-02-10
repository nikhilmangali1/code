#include <stdio.h>

int main() {
    int count, totalTAT = 0, totalWT = 0, avgTAT = 0, avgWT = 0;
    printf("Enter no.of processes: ");
    scanf("%d", &count);

    int p[count];
    int bt[count];
    int remaining_bt[count];
    int wt[count];
    int tat[count];
    int TIME_QUANTUM=0;

    printf("\nENter time slice:");
    scanf("%d",&TIME_QUANTUM);
    printf("Enter Burst Time of each process:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &bt[i]);
        p[i] = i + 1;
        remaining_bt[i] = bt[i];
    }

    int time = 0;
    int completed = 0;

    while (completed < count) {
        for (int i = 0; i < count; i++) {
            if (remaining_bt[i] > 0) {
                if (remaining_bt[i] > TIME_QUANTUM) {
                    time += TIME_QUANTUM;
                    remaining_bt[i] -= TIME_QUANTUM;
                } else {
                    time += remaining_bt[i];
                    wt[i] = time - bt[i];
                    remaining_bt[i] = 0;
                    completed++;
                }
            }
        }
    }

    for (int i = 0; i < count; i++) {
        tat[i] = bt[i] + wt[i];
        totalTAT += tat[i];
        totalWT += wt[i];
    }

    avgTAT = totalTAT / count;
    avgWT = totalWT / count;

    printf("Processes\tBurstTimes\tWaitingTime\tTurnAroundTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\n", p[i], bt[i], wt[i], tat[i]);
    }

    printf("\nAverage Turn Around Time = %d", avgTAT);
    printf("\nAverage Waiting Time = %d", avgWT);

    return 0;
}
