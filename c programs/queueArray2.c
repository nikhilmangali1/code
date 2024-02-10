#include<stdio.h>
#include<stdlib.h>
void enque(int *);
void deque(int *);
void display(int *);
void isEmpty(int *);
int FirstElement(int *);
int LastElement(int *);
int *a=NULL;
int rear=-1,front=-1,cpacity=0;
int main()
{
    int choice;
    int f,l;
    while(1)
    {
        printf("\nEnter 1 enque :");
        printf("\nEnter 2 to deque :");
        printf("\nENter 3 to display:");
        printf("\nENter 4 to know first element:");
        printf("\nENter 5 to know last element:");
        printf("\nEnter 6 to know total elements:");
       // printf("\nENter 7 to know whether is queue full:");
        printf("\nENter 7 to know whether is queue empty:");
        printf("\nEnter 8 to search an element:");
        printf("\n ENter -9 to exit:");
        printf("\n\nENter CHOICE:");
        scanf("%d",&choice);
        if(choice==-9)
        break;
        switch(choice)
        {
            case 1:
            {
                enque(a);
                break;
            }
            case 2:
            {
                deque(a);
                break;
            }
            case 3:
            {
                display(a);
                break;
            }
            case 4:
            {
                f=FirstElement(a);
                printf("\nFirst Element is %d \n",f);
                break;
            }
            case 5:
            {
                l=LastElement(a);
                printf("\nLast Element is %d \n",l);
                break;
            }
            case 6:
            {
                printf("\nTotal elements are: %d \n",cpacity);
                break;
            }
            case 7:
            {
                isEmpty(a);
                break;
            }
            case 8:
            {
                break;
            }
            default:
            {
                printf("\n\nENTER VALID OPERATION!!\n\n");
            }
        }
    }
    display(a);  
    return 0;
}
void enque(int a[])
{
    cpacity=cpacity+1;
    a=(int *)malloc(sizeof(int));
    int e;
    printf("\nENter an element to enque:");
    scanf("%d",&e);
    rear=rear+1;
    a[rear]=e;
}
void deque(int a[])
{
    int x;
    if(front==rear)
    {
        printf("\nQUEUE IS EMPTY!!\n");
    }
    else
    {
        front = front + 1;
        x = a[front];
        printf("\nDequed element is %d \n", x);
    }
}
void display(int a[])
{
    for(int i=front+1;i<=rear;i++)
    {
        printf("%d  ",a[i]);
    }
}
void isEmpty(int a[])
{
    if(front==rear)
    {
        printf("\nQUEUE IS EMPTY!!\n");
    }
}
int FirstElement(int a[])
{
    return a[front+1];
}
int LastElement(int a[])
{
    return a[rear];
}