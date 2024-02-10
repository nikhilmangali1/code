#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node *ptr;
};
struct node *create(struct node *);
void show(struct node *);
void count(struct node *);
int search(struct node *h,int);
void main()
{
    struct node *head;
    int x,j;
    head=NULL;
    head=create(head);
    show(head);
    count(head);
    printf("\n\nEnter an element to know whether element is present in the linkedlist or not!:");
    scanf("%d",&x);
    j=search(head,x);
    if(j==1)
    printf("\nElement is present");
    if(j==-1)
    printf("\nelement is not present");
}
struct node *create(struct node *h)
{
    struct node *temp,*new;
    int a;
    printf("\nEnter elements into linkedlist and Enter -1 to stop entering:\n");
    while(1)
    {
        scanf("%d",&a);
        if(a==-1)
        break;
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=a;
        temp->ptr=NULL;
        if(h==NULL)
        h=temp;
        else
        new->ptr=temp;
        new=temp;
    }
    return h;
}
void show(struct node *h)
{
    while(1)
    {
        printf("%d\t",h->data);
        h=h->ptr;
        if(h==NULL)
        break;
    }
}
void count(struct node *h)
{
    int c=0;
    while(h!=NULL)
    {
        h=h->ptr;
        c=c+1;
    }
    printf("\nTotal Enter elements in the linkedlist: %d",c);
}
int search(struct node *h,int key)
{
    while(h->ptr!=NULL)
    {
        if(h->data==key)
           return 1;   
    }
       h=h->ptr;
       return -1;
}