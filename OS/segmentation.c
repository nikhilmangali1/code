#include<stdio.h>
#include<stdlib.h> // Include this for malloc and free

struct list {
    int seg;
    int base;
    int limit;
    struct list* next;
} *p;

void insert(struct list *q, int base, int limit, int seg) {
    struct list *newNode = (struct list*)malloc(sizeof(struct list));
    newNode->limit = limit;
    newNode->base = base;
    newNode->seg = seg;
    newNode->next = NULL;

    if (p == NULL) {
        p = newNode;
    } else {
        while (q->next != NULL) {
            q = q->next;
        }
        q->next = newNode;
    }
}

int find(struct list *q, int seg) {
    while (q->seg != seg) {
        q = q->next;
    }
    return q->limit;
}

int search(struct list *q, int seg) {
    while (q->seg != seg) {
        q = q->next;
    }
    return q->base;
}

int main() {
    p = NULL;
    int seg, offset, limit, base, c, s, physical;
    printf("Enter segment table\n");
    printf("Enter -1 as segment value for termination\n");

    do {
        printf("Enter segment number: ");
        scanf("%d", &seg);
        if (seg != -1) {
            printf("Enter base value: ");
            scanf("%d", &base);
            printf("Enter value for limit: ");
            scanf("%d", &limit);
            insert(p, base, limit, seg);
        }
    } while (seg != -1);

    printf("Enter offset: ");
    scanf("%d", &offset);
    printf("Enter segmentation number: ");
    scanf("%d", &seg);
    c = find(p, seg);
    s = search(p, seg);

    if (offset < c) {
        physical = s + offset;
        printf("Address in physical memory %d\n", physical);
    } else {
        printf("error\n");
    }

    // Free allocated memory before exiting
    while (p != NULL) {
        struct list* temp = p;
        p = p->next;
        free(temp);
    }

    return 0;
}
