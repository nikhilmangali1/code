#include <stdio.h>

void main() {
    int memsize = 15;
    int pagesize, nofpages;
    int p[100];
    int frameno, offset;
    int LA, PA;
    int choice = 0;

    printf("Your memory size is %d\n", memsize);
    printf("Enter page size: ");
    scanf("%d", &pagesize);
    nofpages = memsize / pagesize;

    for (int i = 0; i < nofpages; i++) {
        printf("Enter the frame of page %d: ", i + 1);
        scanf("%d", &p[i]);
    }

    do {
        printf("Enter logical address: ");
        scanf("%d", &LA);
        frameno = LA / pagesize; 
        offset = LA % pagesize; 
        PA = (p[frameno] * pagesize + offset); 
        printf("\nPhysical Address: %d\n", PA);
        printf("Do you want to continue? [0/1]: ");
        scanf("%d", &choice);
    } while (choice == 1);
}
