#include <stdio.h>

struct PCB {
    int pid, at, bt, st, ct, wt, tat, remaining_bt;
};

int main() {
    printf("Enter count of processes: ");
    int count, totalTAT = 0, totalWT = 0, avgTAT = 0, avgWT = 0;
    scanf("%d", &count);

    struct PCB p[count];
    struct PCB temp;

    // Objects initialization
    for (int i = 0; i < count; i++) {
        p[i].pid = i + 1;
    }

    printf("Enter Arrival times of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].at);
    }

    printf("Enter Burst times of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].bt);
        p[i].remaining_bt = p[i].bt;
    }

    int time = 0;
    int completed = 0;

    while (completed < count) {
        int min_bt = 9999; // A large number to represent infinity
        int shortest = -1;

        for (int i = 0; i < count; i++) {
            if (p[i].at <= time && p[i].remaining_bt < min_bt && p[i].remaining_bt > 0) {
                min_bt = p[i].remaining_bt;
                shortest = i;
            }
        }

        if (shortest == -1) {
            time++;
            continue;
        }

        p[shortest].remaining_bt--;

        if (p[shortest].remaining_bt == 0) {
            completed++;
            p[shortest].ct = time + 1;
            p[shortest].st=p[shortest].ct-p[shortest].bt;
            p[shortest].tat = p[shortest].ct - p[shortest].at;
            p[shortest].wt = p[shortest].tat - p[shortest].bt;
            totalTAT += p[shortest].tat;
            totalWT += p[shortest].wt;
        }

        time++;
    }

    avgTAT = totalTAT / count;
    avgWT = totalWT / count;

    printf("Processes\tArrivalTime\tBurstTimes\tStartingtime\tCompletionTime\tTurnAroundTime\tWaitingTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
               p[i].pid, p[i].at, p[i].bt,p[i].st, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turn Around Time = %d", avgTAT);
    printf("\nAverage Waiting Time = %d", avgWT);

    return 0;
}
