#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct node 
{
    int data;
    struct node *ptr;
};
struct node *create(struct node *);
void display(struct node *);
void count(struct node *);
void insertAtEnd(struct node *,int);
void insert_At_Middle_After_Ref(struct node *,int,int);
void insert_At_Middle_Before_Ref(struct node *,int,int);
void insert_At_Beginning(struct node **,int);
bool search(struct node *,int);
int position_Of_Element(struct node *,int);
void delete_At_End(struct node *);
void delete_At_Middle(struct node *,int);
struct node *delete_At_Beginning(struct node *);
void main()
{
    struct node *head;
    int n,r,position;
    bool b;
    head=NULL;
    head=create(head);
    display(head);
    count(head);
    printf("\nEnter the element to be inserted at END of the linkedlist:");
    scanf("%d",&n);
    insertAtEnd(head,n);
    display(head);
    printf("\nEnter an element to be inserted in the linkedlist AFTER a refernce element:");
    scanf("%d",&n);
    printf("\nEnter refernce element:");
    scanf("%d",&r);
    insert_At_Middle_After_Ref(head,n,r);
    display(head);
    printf("\nEnter an element to be inserted in the linkedlist BEFORE a refernce element:");
    scanf("%d",&n);
    printf("\nEnter refernce element:");
    scanf("%d",&r);
    insert_At_Middle_Before_Ref(head,n,r);
    display(head);
    printf("\nEnter the element to be inserted at BEGINNING of the linkedlist:");
    scanf("%d",&n);
    insert_At_Beginning(&head,n);
    display(head);
    printf("\nEnter the element to know its presence:");
    scanf("%d",&n);
    b=search(head,n);
    if(b==1){
    printf("\n%d is present in the linkedlist\n",n);}
    if(b==0){
    printf("\n%d is not present in the linked list\n",n);}
    printf("\nEnter an element to know its position:");
    scanf("%d",n);
    position=position_Of_Element(head,n);
    printf("\nPosition of the %d element is %d\n",n,position);
    delete_At_End(head);
    printf("\nAfter deleting last node of Linkedlist:\n");
    display(head);
    printf("\nEnter the element to be deleted from the linkedlist:");
    scanf("%d",&n);
    delete_At_Middle(head,n);
    display(head);
    head=delete_At_Beginning(head);
    printf("\nAfter deleting first node of the linkedlist:\n");
    display(head);
}
struct node *create(struct node *h)
{
    struct node *temp,*prev;
    int x;
    printf("\nEnter elements into the linked list and ENter -1 to stop entering:");
    while(1)
    {
        scanf("%d",&x);
        if(x==-1)
        break;
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=x;
        temp->ptr=NULL;
        if(h==NULL)
        h=temp;
        else
        prev->ptr=temp;
        prev=temp;
    }
    return h;
}
void display(struct node *h)
{
    while(h!=NULL)
    {
        printf("%d ",h->data);
        h=h->ptr;
    }
    printf("\n");
}
void count(struct node *h)
{
    int c=0;
    while(h!=NULL)
    {
        c=c+1;
        h=h->ptr;
    }
    printf("Total elements:%d\n",c);
}
void insertAtEnd(struct node *h,int e)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->ptr=NULL;
    while(h->ptr!=NULL)
    {
        h=h->ptr;
    }
    h->ptr=temp;
}
void insert_At_Middle_After_Ref(struct node *h,int e,int ref)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->ptr=NULL;
    while(h->data!=ref)
    {
        h=h->ptr;
    }
   temp->ptr=h->ptr;
   h->ptr=temp;
}
void insert_At_Middle_Before_Ref(struct node *h,int e,int ref)
{
    struct node *temp,*prev;
    prev=NULL;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->ptr=NULL;
    while(h->data!=ref)
    {
        prev=h;
        h=h->ptr;
    }
    temp->ptr=prev->ptr;
    prev->ptr=temp;
}
void insert_At_Beginning(struct node **h,int e)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->ptr=NULL;
    temp->ptr=*h;
    *h=temp;
}
bool search(struct node *h,int key)
{
    while(h!=NULL)
    {
        if(h->data==key)
        return 1;
        h=h->ptr;
    }
        return 0;
}
int position_Of_Element(struct node *h,int e)
{
    struct node *cur;
    cur=h;
    int pos=0;
    while(cur!=NULL&&cur->data!=e)
    {
        pos++;
        cur=cur->ptr;
    }
    return pos;
}
void delete_At_End(struct node *h)
{
    struct node *prev;
    prev=NULL;
    while(h->ptr!=NULL)
    {
       prev=h;
       h=h->ptr;
    }
    prev->ptr=NULL;
    free(h);
}
void delete_At_Middle(struct node *h,int e)
{
    struct node *prev;
    prev=NULL;
    while(h->data!=e)
    {
        prev=h;
        h=h->ptr;
    }
    prev->ptr=h->ptr;
    free(h);
}
struct node *delete_At_Beginning(struct node *h)
{
    return h->ptr;
}