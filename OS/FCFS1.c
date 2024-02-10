#include <stdio.h>

int main()
{
    int count,totalTAT=0,totalWT=0,avgTAT=0,avgWT=0;
    printf("Enter no.of processes:");
    scanf("%d", &count);
    int p[count];
    int at[count];
    int bt[count];
    int st[count];
    int ct[count];
    int wt[count];
    int tat[count];
    printf("Enter Burst Time of each process:\n");
    for (int i = 0; i < count; i++)
    {
        scanf("%d", &bt[i]);
        p[i] = i + 1;
        at[i] = 0;
    }
    st[0] = 0;
    ct[0] = bt[0];
    tat[0] = ct[0];
    wt[0] = tat[0] - bt[0];
    for (int i = 1; i < count; i++)
    {
        st[i] = ct[i - 1];
        ct[i] = st[i] + bt[i];
        tat[i] = ct[i] - at[i];
        wt[i] = tat[i] - bt[i];
    }
    printf("Processes\tArrivalTime\tBurstTimes\tStratingTime\tCompletionTime\tWaitingtime\tTurnAroundtime\n");
    for (int i = 0; i < count; i++)
    {
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i], at[i], bt[i], st[i], ct[i], wt[i], tat[i]);
    }
    for(int i=0;i<count;i++)
    {
        totalTAT+=tat[i];
        totalWT+=wt[i];
    }
    avgTAT=totalTAT/count;
    avgWT=totalWT/count;
    printf("\nAverage Turn Around Time =%d",avgTAT);
    printf("\nAverage Waiting Time =%d",avgWT);
    return 0;
}
