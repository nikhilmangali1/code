#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *ptr;
};
struct node *create(struct node *);
void display(struct node *);
void inserte(struct node *,int);
void search(struct node *,int);
void count(struct node*);
/*
void insertm(struct node *,int);
struct node insertb*(struct node *,int);
void deletee(struct node *,int);
void deletem(struct node *,int);
struct node deleteb(struct node *,int);
*/
void main()
{
    int k,key;
    struct node *head;
    head=NULL;
    head=create(head);
    display(head);
   printf("\n\nEnter k value to insert at the end of linkedlist:");
   scanf("%d",&k);
   count(head);
   inserte(head,k);
   display(head);
   printf("\nEnter an element to search:");
   scanf("%d",&key);
   search(head,key);
}
struct node *create(struct node *h)
{
    int ele;
    struct node *temp,*prev;
    printf("\nEnter elements into linkedlist and \nEnter -69 to stop entering");
    while(507)
    {
        scanf("%d",&ele);
        if(ele==-69)
        break;
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=ele;
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
    int c=0;
    while(h!=NULL)
    {
        printf("%d\n",h->data);
        h=h->ptr;
        c=c+1;
    }
    printf("\ntotal elements are:%d",c);
}
void inserte(struct node *h,int l)
{
    struct node *temp;
    while(h->ptr!=NULL)
    {
        h=h->ptr;
    }
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=l;
        temp->ptr=NULL;
        h->ptr=temp;
}
void search(struct node *h,int k)
{
    while(h->ptr!=NULL)
    {
        if(h->data==k)
        {
            printf("%d is present in linked list ",k);
            break;
        }
        printf("%d is not present in the linkedlist ",k);
        break;
    }
}
void count(struct node *h)
{
    int cnt=0;
    while(h->ptr!=NULL)
    {
        cnt=cnt+1;
        h=h->ptr
    }
    printf("\ntotal elements are %d",cnt);
}