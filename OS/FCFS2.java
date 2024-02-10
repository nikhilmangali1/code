import java.util.Scanner;
class PCB
{
    int pid,at,bt,st,ct,wt,tat;
}
public class FCFS2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter count of processe:");
        int count=s.nextInt();
        PCB[] p=new PCB[count];
        PCB temp=new PCB();

        //objects initialization
        for(int i=0;i<count;i++)
        {
            p[i]=new PCB();
        }

        System.out.println("ENter Arrival times of processes:");
        for(int i=0;i<count;i++)
        {
            p[i].at=s.nextInt();
            p[i].pid=i+1;
        }

        System.out.println("ENter Burst times of processes:");
        for(int i=0;i<count;i++)
        {
            p[i].bt=s.nextInt();
        }

        //sorting according to arrival times

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
        int prevTime=0;
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

        System.out.println("Processes\tArrivalTime\tBurstTimes\tStratingTime\tCompletionTime\tWaitingtime\tTurnAroundtime");
        for(int i=0;i<count;i++)
        {
            System.out.println("P"+p[i].pid+"\t\t"+p[i].at+"\t\t"+p[i].bt+"\t\t"+p[i].st+"\t\t"+p[i].ct+"\t\t"+p[i].wt+"\t\t"+p[i].tat);
        }

        s.close();
    }
}