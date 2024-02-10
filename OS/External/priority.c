#include<stdio.h>
struct PCB
{
    int at,bt,st,ct,tat,wt,rem_bt,pri;
};
int main()
{
    int count=0;
    printf("\nENter no.of process :");
    scanf("%d",&count);
    int totalTAT=0,totalWT=0;
    float avgTAT=0.0,avgWT=0.0;
    struct PCB p[count],temp;
    printf("\nENter arrival times :");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].at);
    }
    printf("\nENter burst times :");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].bt);
        p[i].rem_bt=p[i].bt;
    }
    printf("\nENter priorities :");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&p[i].pri);
    }
    int time=0;
    int completed=0;
    while(completed<count)
    {
        int high=99999;
        int highIndex=-1;
        for(int i=0;i<count;i++)
        {
            if(p[i].at<=time&&p[i].pri<high&&p[i].rem_bt>0)
            {
                high=p[i].pri;
                highIndex=i;
            }
        }
        if(highIndex==-1)
        {
            time++;
            continue;
        } 
        p[highIndex].rem_bt--;
        if(p[highIndex].rem_bt==0)
        {
            completed++;
            p[highIndex].ct=time+1;
            p[highIndex].st=p[highIndex].ct-p[highIndex].bt;
            p[highIndex].tat=p[highIndex].ct-p[highIndex].at;
            p[highIndex].wt=p[highIndex].tat-p[highIndex].bt;
            totalTAT+=p[highIndex].tat;
            totalWT+=p[highIndex].wt;
        }
        time++;
    }
    avgTAT=(float)totalTAT/count;
    avgWT=(float)totalWT/count;
    printf("\nP\tAT\tBT\tPrior\tST\tCT\tTAT\tWT\n");
    for(int i=0;i<count;i++)
    {
        printf("\nP%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n\n",i+1,p[i].at,p[i].bt,p[i].pri,p[i].st,p[i].ct,p[i].tat,p[i].wt);
    }
    printf("\nAverage TAT : %f",avgTAT);
    printf("\nAverage WT : %f",avgWT);
    return 0;
}