#include<stdio.h>
void push(int *,int *,int);
int pop(int *,int *);
void display(int *,int);
int main()
{
    int a[100],top=-1,choice,x,popk;
    while(1)
    {
        printf("\nENter 1 to push an element into stack:\n\nENter 2 to pop an element from the stack:\n\nEnter -1 to stop doing these...");
        scanf("%d",&choice);
        if(choice==-1)
        {break;}
        if(choice==1)
        {
            printf("\nEnter an element to push into the stack:");
            scanf("%d",&x);
            push(a,&top,x);
            display(a,top);
        }
        if(choice==2)
        {
            popk=pop(a,&top);
            printf("\nPopped element=%d\n\n",popk);
            display(a,top);
            if(popk==-1)
            {printf("\n------UNDERFLOW-------\n");}
        }
        if(choice!=1&&choice!=2)
        {
            printf("\nENTER 1 OR 2\n");
        }
    }
    return 0;
}
void push(int arr[],int *t,int e)
{
    if(*t!=100)
    {
        *t=*t+1;
        arr[*t]=e;
    }
    else
    {printf("\n---------OVERFLOW--------\n");}
}
int pop(int arr[],int *t)
{
    int x;
    if(*t!=-1)
    {
        x=arr[*t];
        *t=*t-1;
        return x;
    }
    else
    return -1;
}
void display(int arr[],int t)
{
    while(t!=-1)
    {
        printf("| %d |\n",arr[t]);
        t=t-1;
    }
    printf("\n\n");
}