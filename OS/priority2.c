#include <stdio.h>

struct PCB {
    int pid, at, bt, st, ct, wt, tat, priority, remaining_bt;
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

    printf("Enter Priorities of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].priority);
    }

    int time = 0;
    int completed = 0;

    while (completed < count) {
        int highest_priority = 9999; // A large number to represent low priority
        int selected = -1;

        for (int i = 0; i < count; i++) {
            if (p[i].at <= time && p[i].remaining_bt > 0 && p[i].priority < highest_priority) {
                highest_priority = p[i].priority;
                selected = i;
            }
        }

        if (selected == -1) {
            time++;
            continue;
        }

        p[selected].remaining_bt--;

        if (p[selected].remaining_bt == 0) {
            completed++;
            p[selected].ct = time + 1;
            p[selected].st = p[selected].ct - p[selected].bt;
            p[selected].tat = p[selected].ct - p[selected].at;
            p[selected].wt = p[selected].tat - p[selected].bt;
            totalTAT += p[selected].tat;
            totalWT += p[selected].wt;
        }

        time++;
    }

    avgTAT = totalTAT / count;
    avgWT = totalWT / count;

    printf("Processes\tArrivalTime\tBurstTimes\tPriority\tStartingtime\tCompletionTime\tTurnAroundTime\tWaitingTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
               p[i].pid, p[i].at, p[i].bt, p[i].priority, p[i].st, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turn Around Time = %d", avgTAT);
    printf("\nAverage Waiting Time = %d", avgWT);

    return 0;
}
