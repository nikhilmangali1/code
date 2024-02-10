#include <stdio.h>

struct PCB {
    int pid, at, bt, st, ct, wt, tat;
};

int main() {
    printf("Enter count of processes: ");
    int count,totalTAT=0,totalWT=0,avgTAT=0,avgWT=0;
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
    }

    // Sorting according to arrival times using bubble sort
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (p[j].at > p[j + 1].at) {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    int prevTime = 0;
    for (int i = 0; i < count; i++) {
        if (p[i].at > prevTime) {
            p[i].st = p[i].at;
        } else {
            p[i].st = prevTime;
        }

        p[i].ct = p[i].st + p[i].bt;
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt = p[i].tat - p[i].bt;

        prevTime = p[i].ct;
    }

    printf("Processes\tArrivalTime\tBurstTimes\tStartingTime\tCompletionTime\tWaitingTime\tTurnAroundTime\n");
    for (int i = 0; i < count; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
               p[i].pid, p[i].at, p[i].bt, p[i].st, p[i].ct, p[i].wt, p[i].tat);
    }
    for(int i=0;i<count;i++)
    {
        totalTAT+=p[i].tat;
        totalWT+=p[i].wt;
    }
    avgTAT=totalTAT/count;
    avgWT=totalWT/count;
    printf("\nAverage Turn Around Time =%d",avgTAT);
    printf("\nAverage Waiting Time =%d",avgWT);

    return 0;
}