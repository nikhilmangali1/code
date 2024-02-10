#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *pre;
    struct node *next; 
};
struct node create(struct node);
struct node insertbeg(struct node,int );
void  insertEnd(struct node *,int);
void display(struct node*);
void insertAtPos(struct node*,int ,int);
struct node *deleteAtBeg(struct node *);
void deleteAtEnd(struct node *);
void deleteAtpos(struct node*,int);
void main()
{
struct node *head,*tail;
 struct node *head=NULL;
struct node *tail=NULL;
int n1,option,i,p1;
do{
    printf("Enter 1 to Create Node\n");
    printf("Enter 2 to display\n");
    printf("Enter 3 to insert At End:\n");
    printf("Enter 4 to insert At Desire Opsition\n");
    printf("Enter 5 to insert at bedining\n");
    printf("Enter 6 to delete At Begining:\n");
    printf("Enter 7 to delete At End");
    printf("Enter 8 to delete at desire position");

    scanf("%d",&option);
    switch(option)
    {
    case 1:
    head=create(head);
    break;
    case 2:
    display(head);
    break;
    
    case 3:
    printf("Enter End Element:");
    scanf("%d",&i);
    insertEnd(head,i);
    break;
    case 4:
    printf("Enter positio to insert");
    scanf("%d",&p1);
    printf("Enter data");
    scanf("%d",&i);
    insertAtPos(head,p1,i);
    break;
    case 5:
    printf("Enter element to insert At beginigg:");
    scanf("%d",&i);
    head=insertbeg(head,i);
    break;
    case 6:
    head=deleteAtBeg(head);
    break;
    case 7:
    deleteAtEnd(head);
    break;
    case 8:
    printf("Enter position do you want to delete:\n");
    scanf("%d",&i);
    deleteAtpos(head,i);
    break;
    }
    printf("Enter 14 to Exit:");
    scanf("%d",&n1);
}while (n1!=1);
  

}
struct node *create(struct node *h)
{
    struct node *temp,*newnode,*tail;
    int x;
    printf("Enter The Data:");
    while(1)
    {
        scanf("%d",&x);
        if(x==-1)
        break;
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=x;
        temp->pre=NULL;
        temp->next=NULL;
        if(h==NULL)
        h=temp;
        else
            newnode->next=temp;
            temp->pre=newnode;
            newnode=temp;
        
    }
    return h;
}

void display(struct node *h)
{
    while (h!=NULL)
    {
        printf("%d",h->data);
        h=h->next;
    }
} 
struct node  *insertbeg(struct node *h,int e)
{
struct node *temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=e;
temp->pre=NULL;
temp->next=NULL;
/*if(h=NULL)
h=temp;*/
//else
/*temp->next=*h;
*h->next->pre=temp;
*h=temp;
*/
/*temp->next=*h;
*h=temp;
temp->next->pre=temp;
*/
temp->next=h;
h->next->pre=temp;
h=temp;
return h;
}
void insertEnd(struct node*h,int e)
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->next=NULL;
    temp->pre=NULL;
    while(h->next!=NULL)
    {
        h=h->next;
    }
    if(h==NULL)
    h=temp;
    else
    h->next=temp;
    temp->pre=h;


}
void insertAtPos(struct node *h,int p,int e )
{
    struct node *temp=h;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=e;
    temp->next=NULL;
    temp->pre=NULL;
    for(int i=0;i<(p-1);i++)
    {
       h=h->next;
    }
    h->next->pre=temp;
    temp->next=h->next;
    temp->pre=h;
    h->next=temp;    
}
struct node *deleteAtBeg(struct node *h)
{
     h->pre=NULL;
    return h->next;
    
  /* struct node *temp=h;
   temp=temp->next;
   h=temp;
   h->pre=NULL;
   return h;*/
}
void deleteAtEnd(struct node*h)
{
    struct node *temp=h;
    struct node *ptr=temp->next;
    while(ptr->next!=NULL)
    {
        temp=ptr;
        ptr=ptr->next;
    }
    temp->next=NULL;
}
void deleteAtpos(struct node *h,int e)
{
    struct node *temp=h;
    struct node *ptr=temp->next;
    for(int i=0;i<(e-1);i++)
    {
        temp=ptr;
        ptr=ptr->next;
    }
    temp->next=ptr->next;
    ptr->next->pre=temp;
}