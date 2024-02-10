#include <stdio.h>

struct PCB {
    int at, bt, st, ct, tat, wt, remaining_bt;
};

int main() {
    int count, quantum, totalTAT = 0, totalWT = 0;
    float avgTAT = 0.0, avgWT = 0.0;

    printf("Enter the number of processes: ");
    scanf("%d", &count);

    printf("Enter the time quantum: ");
    scanf("%d", &quantum);

    struct PCB p[count];

    // Input arrival times and burst times
    printf("Enter arrival times:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].at);
    }

    printf("Enter burst times:\n");
    for (int i = 0; i < count; i++) {
        scanf("%d", &p[i].bt);
        p[i].remaining_bt = p[i].bt;
    }

    int time = 0;
    int completed = 0;

    while (completed < count) {
        for (int i = 0; i < count; i++) {
            if (p[i].remaining_bt > 0) {
                if (p[i].remaining_bt <= quantum) {
                    // Process finishes within the quantum
                    time += p[i].remaining_bt;
                    p[i].remaining_bt = 0;
                    p[i].ct = time;
                } else {
                    // Process continues in the next quantum
                    time += quantum;
                    p[i].remaining_bt -= quantum;
                }

                // Calculate turnaround time and waiting time
                p[i].st=p[i].ct-p[i].bt;
                p[i].tat = p[i].ct - p[i].at;
                p[i].wt = p[i].tat - p[i].bt;

                if (p[i].remaining_bt == 0) {
                    completed++;
                }
            }
        }
    }

    // Calculate total turnaround time and waiting time
    for (int i = 0; i < count; i++) {
        totalTAT += p[i].tat;
        totalWT += p[i].wt;
    }

    // Calculate average turnaround time and waiting time
    avgTAT = (float)totalTAT / count;
    avgWT = (float)totalWT / count;

    // Print the results
    printf("\n\nP\tAT\tBT\tST\tCT\tTAT\tWT\n");
    for (int i = 0; i < count; i++) {
        printf("\n\nP%d\t%d\t%d\t%d\t%d\t%d\t%d\n", i + 1, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turnaround Time: %f\n", avgTAT);
    printf("Average Waiting Time: %f", avgWT);

    return 0;
}
