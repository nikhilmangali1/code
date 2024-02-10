#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct node
{
    int data;
    struct node *prev;
    struct node *next;
};
struct node *create(struct node *); 
void display(struct node *);
void count(struct node *);
bool search(struct node *,int);
void insert_At_End(struct node *,int);
void insert_At_Middle_After(struct node *,int,int);
void insert_At_Begin(struct node **,int);
void insert_At_Middle_Before(struct node *,int,int);
void main()
{
    struct node *head;
    int x,ref;
    bool res;
    head=NULL;
    head=create(head);
    display(head);
    printf("\nEnter an/ element to insert at the end of the linkedlist:");
    scanf("%d",&x);
    insert_At_End(head,x);
    display(head);
    count(head);
    printf("\nENter element to know its presence:");
    scanf("%d",&x);
    res=search(head,x);
    if(res==1)
    {printf("\n%d is present in the linked list",x);}
    if(res==0)
    {printf("\n%d is not present in the linked list",x);}
    printf("\nENter an element to be inserted at the beginning of the linked list:");
    scanf("%d",&x);
    insert_At_Begin(&head,x);
    display(head);
    printf("\nEnter an element to be inserted in the middle of the linkedlist AFTER reference element:");
    scanf("%d",&x);
    printf("\nENter refrence element :");
    scanf("%d",&ref);
    insert_At_Middle_After(head,x,ref);
    display(head);
    printf("\nEnter an element to be inserted in the middle of the linkedlist BEFORE reference element:");
    scanf("%d",&x);
    printf("\nENter refrence element :");
    scanf("%d",&ref);
    insert_At_Middle_Before(head,x,ref);
    display(head);
}
struct node *create(struct node *h)
{
    struct node *temp,*newN;
    int x;
    printf("\nENter value and ENter -1 to stop entering:");
    while(1)
    {
        scanf("%d",&x);
        if(x==-1)
        break;
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=x;
        temp->prev=NULL;
        temp->next=NULL;
        if(h==NULL)
        h=temp;
        else
        newN->next=temp;
        temp->prev=newN;
        newN=temp;
    }
    return h;
}
void display(struct node *h)
{
    while(h!=NULL)
    {
        printf("%d  ",h->data);
        h=h->next;
    }
}
void insert_At_End(struct node *h,int e)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=NULL;
    while(h->next!=NULL)
    {
        h=h->next;
    }
    temp->prev=h;
    h->next=temp;
}
void count(struct node *h)
{
    int cnt=0;
    while(h!=NULL)
    {
        cnt=cnt+1;
        h=h->next;
    }
    printf("\n\nTotal nodes are %d",cnt);
}
bool search(struct node *h,int key)
{
    while(h!=NULL)
    {
        if(h->data==key)
        return 1;
        h=h->next;
    }
    return 0;
}
void insert_At_Begin(struct node **h,int e)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=NULL;
   // h=temp;
    temp->next=*h;
  //  h->prev=temp;

  *h=temp;
  temp->next->prev=temp;
  //h->next->prev=temp;
  //h=temp;

   // temp->prev=NULL;
    //h->prev=temp;
    //temp->next=h;
}
void insert_At_Middle_After(struct node *h,int e,int ref)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=NULL;
    while(h->data!=ref)
    {
        h=h->next;
    }
    temp->next=h->next;
    temp->prev=h;
    h->next=temp;
}
void insert_At_Middle_Before(struct node *h,int e,int ref)
{
    struct node *temp;
   // struct node *temp1=temp->next;
    //struct node *newnode;
   // bef=NULL;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=NULL;
    while(h->data!=ref)
    {
       // temp=temp1;
       // temp1=temp1->next;
      //  bef=h;
        h=h->next;
    }
    //temp->next=h->next->prev
    h->next=temp;
    temp->prev=h;
    temp->next=temp->next->prev;
    temp->next->prev=temp;
    /*temp->next=h->prev;
    bef->next=temp;
    temp->prev=bef;
    h->prev=temp;*/

//newnode->next=temp1;
////newnode->next->prev=newnode;
//temp1->prev=newnode;
//temp->next=newnode;
//newnode->prev=temp;
}