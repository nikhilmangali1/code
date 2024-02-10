#include<stdio.h>
void enque();
void dequeue();
void display();
int a[5],front=-1,rear=-1;
int main()
{
    int choice;
    while(1)
    {
        printf("\nENter choice:");
        scanf("%d",&choice);
        if(choice==-1)
        break;
        switch(choice)
        {
            case 1:
            {
                enque();
                display();
                break;
            }
            case 3:
            {
                dequeue();
                display();
                break;
            }
            case 2:
            {
                display();
                break;
            }
            default:
            {
                printf("\nINVALID OPERATION!!\n");
                break;
            }
        }
    }
    return 0;
}
void enque()
{
    int e;
    printf("\nENter a value to insert it into queue:");
    scanf("%d",&e);
    if(rear+1==5)
    {
        printf("\nOverflow!\n");
    }
    else
    {
        if(front==-1&&rear==-1)
        {
            front=0;
            rear=0;
        }
        else
        {
            rear=rear+1;
        }
        a[rear]=e;
    }
}
void dequeue()
{
    if(front==-1 || front > rear)
    {
        printf("\nUnderflow!!\n");
    }
    else
    {
        printf("\nDeleted element is %d\n",a[front]);
        front++;
    }
}

void display()
{
    if(rear==-1)
    {
        printf("\nUnderflow!!\n");
    }
    else
    {
        for(int i=front;i<=rear;i++)
        {
            printf("\t%d",a[i]);
        }
    }
}
