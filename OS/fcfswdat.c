#include<stdio.h>
struct PCB
{
    int at,bt,st,ct,tat,wt;
};
int main()
{
    int count=0,prevTime=0,totalTAT=0,totalWT=0;
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
    }
    //sort according to arrival times
    for(int i=0;i<count-1;i++)
    {
        for(int j=0;j<count-i-1;j++)
        {
            if(p[j].at>p[j+1].at)
            {
                temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }
    for(int i=0;i<count;i++)
    {
        if(p[i].at>prevTime)
        {
            p[i].st=p[i].at;
        }
        else
        {
            p[i].st=prevTime;
        }
        p[i].ct=p[i].st+p[i].bt;
        p[i].tat=p[i].ct-p[i].at;
        p[i].wt=p[i].tat-p[i].bt;
        prevTime=p[i].ct;
    }
    printf("\n\nP\tAT\tBT\tST\tCT\tTAT\tWT\n");
    for(int i=0;i<count;i++)
    {
        printf("\n\nP%d\t%d\t%d\t%d\t%d\t%d\t%d\n",i+1,p[i].at,p[i].bt,p[i].st,p[i].ct,p[i].tat,p[i].wt);
    }
    for(int i=0;i<count;i++)
    {
        totalTAT+=p[i].tat;
        totalWT+=p[i].wt;
    }
    avgTAT=(float)totalTAT/count;
    avgWT=(float)totalWT/count;
    printf("\nAverage TAT:%f\n",avgTAT);
    printf("\nAverage Wt:%f",avgWT);
    return 0;
}