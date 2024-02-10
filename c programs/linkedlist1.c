#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *ptr;
};
struct node *create(struct node *);
void display(struct node *);
void main()
{
    struct node *head;
    head=NULL;
    head=create(head);
    display(head);
}
struct node *create(struct node *h)
{
    struct node *temp,*prev;
    int x;
    printf("Enter values into the linked list:\nENTER -1 TO STOP :");
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
    printf("\nValues in LinkedList are:\n");
    printf("\n|VALUE\t|\tADDRESS|\n");
    while(h!=NULL)
    {
        printf("\n-------------------------------------------------\n");
        printf("\n|%d\t|\t%u|\n",h->data,h);
        h=h->ptr;
    }
}