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
bool search(struct node *);
void position_Of_Element(struct node *);
void insert_At_End(struct node *);
void insert_At_Begin(struct node **);
void insert_At_Middle_After_Ref(struct node *);
void insert_At_Middle_Before_Ref(struct node *);
void delete_Last_Node(struct node *);
void delete_Middle_Node_Of_Ref(struct node *);
struct node *delete_First_Node(struct node *);
int main()
{
    struct node *head;
    bool b;
    int choice;
    head=NULL;
    head=create(head);
    display(head);
    while(1){
    printf("\n\nEnter 1 to know Node number of the element");
    printf("\nEnter 2 to count the no.of nodes:");
    printf("\nEnter 3 to search the element in the linked list:");
    printf("\nEnter 4 to insert an element at the end of the linked list:");
    printf("\nEnter 5 to insert an element at the beginning of the linked list:");
    printf("\nEnter 6 to insert an element in the middle of the linked list after a reference element:");
    printf("\nEnter 7 to insert an element in the middle of the linked list before a reference element :");
    printf("\nEnter 8 to delete the last node:");
    printf("\nEnter 9 to delete the node of the enetred element:");
    printf("\nEnter 10 to delete the first node:\n");
    printf("\nENter -2 to stop doing operations:");
    scanf("%d",&choice);
    if(choice==-2)
    break;
    switch(choice)
    {
        case 1:
        { 
            position_Of_Element(head);
            break;
        }
        case 2:
        {
            count(head);
            break;
        }
        case 3:
        {
            b=search(head);
            if(b==1)
            {
                printf("\n\nElement is present in the linked list");
            }
            if(b==0)
            {
                printf("\n\nElement is not present in the linked list");
            }
            break;
        }
        case 4:
        {
            insert_At_End(head);
            display(head);
            break;
        }
        case 5:
        {
            insert_At_Begin(&head);
            display(head);
            break;
        }
        case 6:
        {
            insert_At_Middle_After_Ref(head);
            display(head);
            break;
        }
        case 7:
        {
            insert_At_Middle_Before_Ref(head);
            display(head);
            break;
        }
        case 8:
        {
            delete_Last_Node(head);
            display(head);  
            break; 
        }
        case 9:
        {
            delete_Middle_Node_Of_Ref(head);
            display(head);
            break;
        }
        case 10:
        {
            head=delete_First_Node(head);
            printf("\n\nAfter deleting last node:\n");
            display(head);
            break;
        }
        default:
        {
            printf("\nEnter valid operation:");
            break;
        }
    }
}
}
struct node *create(struct node *h)
{
    struct node *temp,*prev;
    int x;
    temp=NULL;
    printf("\nEnter values to the Linked list:\nEnter -1 to stop entering:");
    while(1)
    {
        scanf("%d",&x);
        if(x==-1)
        {
            break;
        }
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=x;
        temp->ptr=NULL;
        if(h==NULL)
        {
            h=temp;
        }
        else
        {
            prev->ptr=temp;
        }
        prev=temp;
    }
    return h;
}
void display(struct node *h)
{
    while(h!=NULL)
    {
        printf("%d  ",h->data);
        h=h->ptr;
    }
}
void count(struct node *h)
{
    int c=0;
    while(h!=NULL)
    {
        c=c+1;
        h=h->ptr;
    }
    printf("\n\nTotal Nodes: %d ",c);
}
bool search(struct node *h)
{
    int key;
    printf("\n\nEnter value to be searched:");
    scanf("%d",&key);
    while(h!=NULL)
    {
        if(h->data==key)
        return 1;
        h=h->ptr;
    }
    return 0;
}
void position_Of_Element(struct node *h)
{
    int e,pos=1;
    printf("\nEnter an element to know its position:");
    scanf("%d",&e);
    while(h->data!=e)
    {
        pos=pos+1;
        h=h->ptr;
    }
    printf("\nPosition of given element %d is %d ",e,pos);
}
void insert_At_End(struct node *h)
{
    struct node *temp;
    int x;
    temp=NULL;
    printf("\nEnter data value to be insertes at the end of the linked list:");
    scanf("%d",&x);
    while(h->ptr!=NULL)
    {
        h=h->ptr;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    temp->ptr=NULL;

    h->ptr=temp;
}
void insert_At_Begin(struct node **ah)
{
    struct node *temp;
    int x;
    temp=NULL;
    printf("\nEnter value to be inserted at the beginning of the linked list: ");
    scanf("%d",&x);
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    temp->ptr=*ah;
    *ah=temp;
}
void insert_At_Middle_After_Ref(struct node *h)
{
    struct node *temp;
    int x,ref;
    temp=NULL;
    printf("\nEnter element to be inserted in the middle of the linked list after a refrence element:");
    scanf("%d",&x);
    printf("\nEnter reference element:");
    scanf("%d",&ref);
    while(h->data!=ref)
    {
        h=h->ptr;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    temp->ptr=h->ptr;
    h->ptr=temp;
}
void insert_At_Middle_Before_Ref(struct node *h)
{
    struct node *temp,*prev;
    int x,ref;
    temp=NULL;
    prev=NULL;
    printf("\nEnter an element to be inserted in the middle of the linked list before a reference element:");
    scanf("%d",&x);
    printf("\nEnter reference element:");
    scanf("%d",&ref);
    while(h->data!=ref)
    {
        prev=h;
        h=h->ptr;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    temp->ptr=prev->ptr;
    prev->ptr=temp;
}
void delete_Last_Node(struct node *h)
{
    struct node *temp;
    temp=NULL;
    while(h->ptr!=NULL)
    {
        temp=h;
        h=h->ptr;
    }
    temp->ptr=NULL;
    free(h);
    printf("\n\nAfter deleting last node:\n");
}
void delete_Middle_Node_Of_Ref(struct node *h)
{
    struct node *temp;
    int ref;
    temp=NULL;
    printf("\n\nEnter reference element to delete that node where the element is present:");
    scanf("%d",&ref);
    while(h->data!=ref)
    {
        temp=h;
        h=h->ptr;
    }
    temp->ptr=h->ptr;
    free(h);
    printf("\nAfter deleting node which the entered element is present:\n");
}
struct node *delete_First_Node(struct node *ah)
{
    return ah->ptr;
}