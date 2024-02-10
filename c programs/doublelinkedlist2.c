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
void Node_No(struct node *);
void count(struct node *);
bool search(struct node *h);
void insert_At_End(struct node *);
void insert_At_Begin(struct node **);
void insert_At_Middle_After_Ref(struct node *);
void insert_At_Middle_Before_Ref(struct node *h); 
//void insert_At_Pos(struct node *);
void delete_Last_Node(struct node *);
void delete_Middle_Node_of_Given_Element(struct node *);
struct node *delete_First_Node(struct node *);
int main()
{
    struct node *head;
    int choice;
    bool k;
    head=NULL;
    head=create(head);
    display(head);
    while(1)
    {
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
            Node_No(head);
            break;
        }
        case 2:
        {
            count(head);
            break;
        }
        case 3:
        {
            k=search(head);
            if(k==1)
            {
                printf("\nElement is present in the linked list!\n");
            }
            if(k==0)
            {
                printf("\nElement is not present in the linked list\n");
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
            //printf("\n\n%u",head->next);
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
            printf("\nAfter deleting last node:");
            display(head);
            break;
        }
        case 9:
        {
            delete_Middle_Node_of_Given_Element(head);
            printf("\nAfter deleting the node of the element resided:");
            display(head);
            break;
        }
        case 10:
        {
            head=delete_First_Node(head);
            printf("\nAfter deleting first node:");
            display(head);
        }
       /* case 11:
        {
            insert_At_Pos(head);
            display(head);
            break;
        }*/
        default:
        {
            printf("\nINAVLID OPERATION:");
            break;
        }
    }
    }
    return 0;
}
struct node *create(struct node *h)
{
    struct node *temp,*newN;
    int x;
    temp=NULL;
    newN=NULL;
    printf("\nEnter values to be inserted in the linked list: AND \nEnter -1 to stop entering");
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
        {
            h=temp;
        }
        else
        {
            newN->next=temp;
            temp->prev=newN;
        }
        newN=temp;
    }
    return h;
}
void display(struct node *h)
{
    printf("\n\n");
    while(h!=NULL)
    {
        printf("%d\t",h->data);
        h=h->next;
    }
}
void Node_No(struct node *h)
{
    int no=1,e;
    printf("\nENter element to know its node number:");
    scanf("%d",&e);
    while(h->data!=e)
    {
        no=no+1;
        h=h->next;
    }
    printf("\nNode number of the entered data %d is  %d ",e,no);
}
void count(struct node *h)
{
    int c=0;
    while(h!=NULL)
    {
        c=c+1;
        h=h->next;
    }
    printf("\nTotal no.of nodes are %d",c);
}
bool search(struct node *h)
{
    int key;
    printf("\nEnter key value to know whether it is present or not:");
    scanf("%d",&key);
    while(h!=NULL)
    {
        if(h->data==key)
        return 1;
        h=h->next;
    }
    return 0;
}
void insert_At_End(struct node *h)
{
    struct node *temp;
    int e;
    temp=NULL;
    printf("\nEnter an element to be inserted at the end of the linked list:");
    scanf("%d",&e);
    while(h->next!=NULL)
    {
        h=h->next;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=NULL;

    temp->prev=h;
    h->next=temp;
}
void insert_At_Begin(struct node **ah)
{
    struct node *temp;
    int e;
    temp=NULL;
    printf("\nEnter an element to be inserted at the beginning of the linked lsit:");
    scanf("%d",&e);
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=NULL;
    temp->next=*ah;
    *ah=temp;
}
void insert_At_Middle_After_Ref(struct node *h)
{
    struct node *temp;
    int e,ref;
    temp=NULL;
    printf("\nEnter an element to be inserted in the in the linked list after reference element:");
    scanf("%d",&e);
    printf("\nENter reference element:");
    scanf("%d",&ref);
    while(h->data!=ref)
    {
        h=h->next;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->prev=h;
    temp->next=h->next;
    h->next=temp;
}
void insert_At_Middle_Before_Ref(struct node *h)
{
    struct node *temp,*dummy;
    int e,ref;
    temp=NULL;
    dummy=NULL;
    printf("\nEnter an element to be inserted in the linked list before reference element:");
    scanf("%d",&e);
    printf("\nENter reference element:");
    scanf("%d",&ref);
    while(h->data!=ref)
    {
        dummy=h;
        h=h->next;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->next=h;
    temp->prev=dummy;
    dummy->next=temp;
}
/*void insert_At_Pos(struct node *h)
{
    struct node *temp;
    int pos;
    temp=NULL;
    printf("\nEnter position to insert a node:");
    scanf("%d",&pos);
    if(pos==1)
    {insert_At_Begin(h);}
    else
    {
        while(h!=NULL)
        {

        }
    }
}*/
void delete_Last_Node(struct node *h)
{
    struct node *dummy;
    dummy=NULL;
    while(h->next!=NULL)
    {
        dummy=h;
        h=h->next;
    }
    dummy->next=NULL;
    free(h);
}
void delete_Middle_Node_of_Given_Element(struct node *h)
{
    struct node *dummy;
    int ele;
    dummy=NULL;
    printf("\nEnter An element to delete the node:");
    scanf("%d",&ele);
    while(h->data!=ele)
    {
        dummy=h;
        h=h->next;
    }
    dummy->next=h->next;
    free(h);
}
struct node *delete_First_Node(struct node *h)
{
    return h->next;
}