import java.util.Scanner;
public class FCFS {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("ENter no.of processes:");
        int count=s.nextInt();
        int[] p=new int[count];
        int[] at=new int[count];
        int[] bt=new int[count];
        int[] st=new int[count];
        int[] ct=new int[count];
        int[] wt=new int[count];
        int[] tat=new int[count];
        System.out.println("ENter Burst Time of each process:");
        for(int i=0;i<count;i++)
        {
            bt[i]=s.nextInt();
            p[i]=i+1;
            at[i]=0;
        }

        st[0]=0;
        ct[0]=bt[0];
        tat[0]=ct[0];
        wt[0]=tat[0]-bt[0];

        for(int i=1;i<count;i++)
        {
            st[i]=ct[i-1];
            ct[i]=st[i]+bt[i];
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
        }
        System.out.println("Processes\tArrivalTime\tBurstTimes\tStratingTime\tCompletionTime\tWaitingtime\tTurnAroundtime");
        for(int i=0;i<count;i++)
        {
            System.out.println("P"+p[i]+"\t\t"+at[i]+"\t\t"+bt[i]+"\t\t"+st[i]+"\t\t"+ct[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
        }
        s.close();
    }
}
