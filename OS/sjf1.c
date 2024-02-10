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

    printf("Enter Burst times of processes:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].bt);
         p[i].pid = i + 1;
         p[i].at=0;
    }

    // Sorting according to arrival times using bubble sort
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (p[j].bt > p[j + 1].bt) {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    p[0].st=0;
    p[0].ct=p[0].bt;
    p[0].tat=p[0].ct;
    p[0].wt=p[0].tat-p[0].bt;

    for (int i = 1; i < count; i++) {
        p[i].st=p[i-1].ct;
        p[i].ct = p[i].st + p[i].bt;
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt = p[i].tat - p[i].bt;
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
