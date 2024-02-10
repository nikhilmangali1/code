#include<stdio.h>
#define cap 5
void enque(int *);
void deque(int *);
void display(int *);
int rear=-1,front=-1;
int main()
{
    int choice,ele,a[cap];
    while(1)
    {
        printf("\nENter choice \n\n1.enQ\n2.deQ\n-1.exit\n");
        scanf("%d",&choice);
        if(choice==-1)
        {
            break;
        }
        switch(choice)
        {
            case 1:
            {
                enque(a);
                display(a);
                break;
            }
            case 2:
            {
                deque(a);
                display(a);
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
void enque(int a[])
{
    int ele;
    printf("\nEnter an element to enque:");
    scanf("%d",&ele);
    rear=rear+1;
    a[rear]=ele;
}
void deque(int a[])
{
    if(front==rear)
    {
        printf("\nEMPTY\n");
    }
    else
    {
        front=front+1;
        int x=a[front];
        printf("\n dequed element is %d\n",x);
    }
}
void display(int a[])
{
    for(int i=front+1;i<=rear;i++)
    {
        printf("%d\t",a[i]);
    }
}