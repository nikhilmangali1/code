#include <stdio.h>
#include <stdbool.h>

struct PCB {
    int pid, at, bt, st, ct, wt, tat, pri, remaining_bt;
};

int main() {
    printf("Enter count of processes: ");
    int count, totalTAT = 0, totalWT = 0, avgTAT = 0, avgWT = 0;
    scanf("%d", &count);

    struct PCB p[count];
    struct PCB temp;

    printf("Enter Burst times of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].bt);
        p[i].pid = i + 1;
        p[i].remaining_bt = p[i].bt;
    }

    printf("Enter Arrival times of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].at);
    }

    printf("Enter priorities of each process\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].pri);
    }

    int time = 0;
    int completed = 0;

    while (completed < count) {
        int highestPriorityIndex = -1;
        int highestPriority = 9999; // Assuming a high priority value for comparison

        // Find the process with the highest priority and not yet completed
        for (int i = 0; i < count; i++) {
            if (p[i].remaining_bt > 0 && p[i].at <= time && p[i].pri < highestPriority) {
                highestPriority = p[i].pri;
                highestPriorityIndex = i;
            }
        }

        if (highestPriorityIndex == -1) {
            time++;
            continue;
        }

        // Process with the highest priority is selected and executed for 1 time unit
        p[highestPriorityIndex].remaining_bt--;
        time++;

        if (p[highestPriorityIndex].remaining_bt == 0) {
            completed++;
            p[highestPriorityIndex].ct = time;
            p[highestPriorityIndex].tat = p[highestPriorityIndex].ct - p[highestPriorityIndex].at;
            p[highestPriorityIndex].wt = p[highestPriorityIndex].tat - p[highestPriorityIndex].bt;
            totalTAT += p[highestPriorityIndex].tat;
            totalWT += p[highestPriorityIndex].wt;
        }
    }

    avgTAT = totalTAT / count;
    avgWT = totalWT / count;

    printf("Processes\tArrivalTime\tBurstTimes\tStartingTime\tCompletionTime\tWaitingTime\tTurnAroundTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
               p[i].pid, p[i].at, p[i].bt, p[i].at + p[i].wt, p[i].ct, p[i].wt, p[i].tat);
    }

    printf("\nAverage Turn Around Time = %d", avgTAT);
    printf("\nAverage Waiting Time = %d", avgWT);

    return 0;
}
