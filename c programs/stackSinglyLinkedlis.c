#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *ptr;
};
struct node *push_Element(struct node *);
struct node *pop_Element(struct node *);
int peek_Element(struct node *);
void is_Stack_Empty(struct node *);
int count(struct node *);
void element_At_Position(struct node *);
void print_Last_Element(struct node *);
void insert_Element_At_Last(struct node *);
void display(struct node *);
int main()
{
    struct node *top=NULL;
    int choice,tos,cnt;
    while(1)
    {
        printf("\n\nENter choice:");
        printf("\nENter 1 push an element in to the stack:");
        printf("\nENter 2 to pop an element from the stack:");
        printf("\nENter 3 to return peak value:");
        printf("\nENter 4 to know is stack empty:");
        printf("\nEnter 5 to know no.of elements:");
        printf("\nEnter 6 to know element at position:");
        printf("\nEnter 7 to print last element:");
        printf("\nENter 8 to insert an element at the bottom of the stack:");
        printf("\nENter -1 to stop doing these opertions:");
        scanf("%d",&choice);
        if(choice==-1)
        break;
        switch(choice)
        {
            case 1:
            {
                top=push_Element(top);
                display(top);
                break;
            }
            case 2:
            {
                is_Stack_Empty(top);
                printf("\npopped element is %d \n",top->data);
                top=pop_Element(top);
                display(top);
                break;
            }
            case 3:
            {
                tos=peek_Element(top);
                printf("\nElement at the top of the stack[TOS] is %d\n",tos);
                break;
            }
            case 4:
            {
                is_Stack_Empty(top);
                break;
            }
            case 5:
            {
                cnt=count(top);
                printf("\nNo.of elements in the stack are %d\n",cnt);
                break;
            }
            case 6:
            {
                element_At_Position(top);
                break;
            }
            case 7:
            {
                print_Last_Element(top);
                break;
            }
            case 8:
            {
                insert_Element_At_Last(top);
                display(top);
                break;
            }
            default:
            {
                printf("\nINVALID OPERATION");
                break;
            }
        }
    }
}
struct node *push_Element(struct node *t)
{
    struct node *temp=NULL;
    int element;
    printf("\nENter an element to push in to stack:");
    scanf("%d",&element);
    temp=(struct node*)malloc(1*sizeof(struct node));
    temp->data=element;
    temp->ptr=NULL;
    if(t==NULL)
    {
    t=temp;
    t->ptr=NULL;
    }
    else
    {
    temp->ptr=t;
    t=temp;
    }
    return t;
}
void display(struct node *t)
{
    printf("\n\n");
    while(t!=NULL)
    {
        printf("\n|%d|",t->data);
        t=t->ptr;
    }
}
struct node *pop_Element(struct node *t)
{
    struct node *temp;
    temp=t;
    t=t->ptr;
    free(temp);
    return t;
}
int peek_Element(struct node *t)
{
    is_Stack_Empty(t);
    return t->data;
}
void is_Stack_Empty(struct node *t)
{
    if(t==NULL)
    {
        printf("\nStack is Empty[UNDERFLOW]\n");
    }
    else
    {
        printf("\nStack is not empty\n");
    }
}
int count(struct node *t)
{
    int cc=0;
    is_Stack_Empty(t);
    while(t!=NULL)
    {
        cc++;
        t=t->ptr;
    }
    return cc;
}
void element_At_Position(struct node *t)
{
    int pos,cnt=0,f;
    printf("\nEnter position/index of the element:");
    scanf("%d",&pos);
    count(t);
    if(pos==0)
    {
        f=peek_Element(t);
        printf("\nElement at index %d is %d \n",pos,f);
    }
    else{
        while(t!=NULL)
        {
            cnt++;
            t=t->ptr;
            if(pos==cnt)
            break;
        }
        printf("\nElement at index %d is %d\n",pos,t->data);
    }
}
void print_Last_Element(struct node *t)
{
    while(t->ptr!=NULL)
    {
        t=t->ptr;
    }
    printf("\nLast element is the stack is %d\n",t->data);
}
void insert_Element_At_Last(struct node *t)
{
    struct node *temp=NULL;
    int e;
    printf("\nEnter data to to pushed to the bottom of the stack:");
    scanf("%d",&e);
    temp=(struct node*)malloc(1*sizeof(struct node));
    temp->data=e;
    temp->ptr=NULL;
    if(t==NULL)
    t=temp;
    while(t->ptr!=NULL)
    {
        t=t->ptr;
    }
    t->ptr=temp;
}