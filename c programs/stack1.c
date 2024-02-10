#include <stdio.h>
void push(int *, int, int *);
void pop(int *,int *);
void display(int *, int );
#define capacity 5
int main()
{
    int a[capacity];
    int ele;
    int top = -1;
    int choice;
    while (1)
    {
        printf("\nenter\n1.push\n2.pop\n-1.exit");
        scanf("%d",&choice);
        if (choice == -1)
        {
            break;
        }
        switch (choice)
        {
        case 1:
        {
            printf("\nEnter element to push into the stack");
            scanf("%d", &ele);
            push(a, ele, &top);
            display(a, top);
            break;
        }
        case 2:
        {
            pop(a, &top);
            display(a, top);
            break;
        }
        default:
        {
            printf("\nINVALID\n");
            break;
        }
        }
    }
    return 0;
}
void push(int a[], int e, int *t)
{
    *t = *t + 1;
    a[*t] = e;
}
void pop(int a[], int *t)
{
    int e = a[*t];
    *t = *t - 1;
    printf("\n popped element is %d \n", e);
}
void display(int a[], int t)
{
    while (t != -1)
    {
        printf("%d\n", a[t]);
        t = t - 1;
    }
}