import java.util.Scanner;

class PCB {
    int pid, at, bt, st, ct, wt, tat;
}

public class SJF1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of processes:");
        int count = s.nextInt();
        PCB[] p = new PCB[count];
        PCB temp = new PCB();

        // Object initialization
        for (int i = 0; i < count; i++) {
            p[i] = new PCB();
        }

        System.out.println("Enter the arrival times of processes:");
        for (int i = 0; i < count; i++) {
            p[i].at = s.nextInt();
            p[i].pid = i + 1; // Assign process ID
        }

        System.out.println("Enter the burst times of processes:");
        for (int i = 0; i < count; i++) {
            p[i].bt = s.nextInt();
        }

        // Sorting according to burst times (SJF)
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (p[j].bt > p[j + 1].bt) {
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (i == 0 || p[i].st != 0 || p[i].st != p[i - 1].ct) {
                p[i].st = p[i].at;
            } else {
                p[i].st = p[i - 1].ct;
            }
            p[i].ct = p[i].st + p[i].bt;
            p[i].tat = p[i].ct - p[i].at;
            p[i].wt = p[i].tat - p[i].bt;
        }

        System.out.println("Processes\tArrival Time\tBurst Time\tStarting Time\tCompletion Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < count; i++) {
            System.out.println("P" + p[i].pid + "\t\t" + p[i].at + "\t\t" + p[i].bt + "\t\t" + p[i].st + "\t\t" + p[i].ct
                    + "\t\t" + p[i].wt + "\t\t" + p[i].tat);
        }

        s.close();
    }
}
