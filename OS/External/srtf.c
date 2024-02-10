#include<stdio.h>
struct PCB
{
    int at,bt,st,ct,tat,wt,rem_bt;
};
int main()
{
    int count=0,totalTAT=0,totalWT=0;
    float avgTAT=0.0,avgWT=0.0;
    printf("\nEnter no.pf process:");
    scanf("%d",&count);
    struct PCB p[count],temp;
    printf("\nEnter arrival times :");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].at);
    }
    printf("\nEnter burst times :");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].bt);
        p[i].rem_bt=p[i].bt;
    }
    int time=0;
    int completed=0;
    while(completed<count)
    {
        int min_bt=99999;
        int shortest=-1;
        for(int i=0;i<count;i++)
        {
            if(p[i].at<=time
            &&p[i].rem_bt<min_bt&&p[i].rem_bt>0)
            {
                min_bt=p[i].rem_bt;
                shortest=i;
            }
        }
        if(shortest==-1)
        {
            time++;
            continue;
        }
        p[shortest].rem_bt--;
        if(p[shortest].rem_bt==0)
        {
            completed++;
            p[shortest].ct=time+1;
            p[shortest].st=p[shortest].ct-p[shortest].bt;
            p[shortest].tat=p[shortest].ct-p[shortest].at;
            p[shortest].wt=p[shortest].tat-p[shortest].bt;
            totalTAT+=p[shortest].tat;
            totalWT+=p[shortest].wt;
        }
        time++;
    }
    
    printf("\n\nP\tAT\tBT\tST\tCT\tTAT\tWT\n");
    for(int i=0;i<count;i++)
    {
        printf("\n\nP%d\t%d\t%d\t%d\t%d\t%d\t%d\n",i+1,p[i].at,p[i].bt,p[i].st,p[i].ct,p[i].tat,p[i].wt);
    }
    avgTAT=(float)totalTAT/count;
    avgWT=(float)totalWT/count;
    printf("\nAverage TAT:%f\n",avgTAT);
    printf("\nAverage Wt:%f",avgWT);
    return 0;
}