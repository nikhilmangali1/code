#include<stdio.h>
struct PCB
{
    int at,bt,st,ct,tat,wt,rem_bt;
};
int main()
{
    int count=0;
    int totalTAT=0,totalWT=0;
    float avgTAT=0.0,avgWT=0;
    printf("\nEnter no.of process:");
    scanf("%d",&count);
    int quantum=0;
    printf("\nENter quantun value :");
    scanf("%d",&quantum);
    struct PCB p[count];
    printf("\nENter arrival times");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].at);
    }
    printf("\nENter burst times");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].bt);
        p[i].rem_bt=p[i].bt;
    }
    int time=0;
    int completed=0;
    while(completed<count)
    {
        for(int i=0;i<count;i++)
        {
            if(p[i].rem_bt>0)
            {
                if(p[i].rem_bt<=quantum)
                {
                    time+=p[i].rem_bt;
                    p[i].rem_bt=0;
                    p[i].ct=time;
                }
                else
                {
                    time+=quantum;
                    p[i].rem_bt-=quantum;
                }
                if(p[i].rem_bt==0)
                {
                    completed++;
                }
                p[i].st=p[i].ct-p[i].bt;
                p[i].tat=p[i].ct-p[i].at;
                p[i].wt=p[i].tat-p[i].bt;
            }
        }
    }
    for(int i=0;i<count;i++)
    {
        totalTAT+=p[i].tat;
        totalWT+=p[i].wt;
    }
    avgTAT=(float)totalTAT/count;
    avgWT=(float)totalWT/count;

    printf("\n\nP\tAT\tBT\tST\tCT\tTAT\tWT\n");
    for (int i = 0; i < count; i++) {
        printf("\n\nP%d\t%d\t%d\t%d\t%d\t%d\t%d\n", i + 1, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }
    
    printf("\nAverage TAT : %f ",avgTAT);
    printf("\nAverage WT : %f ",avgWT);
    return 0;
}