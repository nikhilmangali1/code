//creation and displaying single linked list statically
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *ptr;
};
void main()
{
    struct node *head,*temp1,*temp2,*temp3;
    head=NULL;

    temp1=(struct node*)malloc(sizeof(struct node));        //First node creation of memory
    head=temp1;                                             //Initially head value assigned to be NULL
    temp1->data=100;                                        //assigning data to first node
    temp1->ptr=NULL;                                           //address part of first node initialised to NULL

    temp2=(struct node*)malloc(sizeof(struct node));        //Second node creation 
    temp1->ptr=temp2;                                        //address of second node is storing in first node
    temp2->data=200;                                        //assigning data to second node
    temp2->ptr=NULL;                                        //address part of second node initialised to NULL

    temp3=(struct node*)malloc(sizeof(struct node));        //Third node creation 
    temp2->ptr=temp3;
    temp3->data=300;
    temp3->ptr=NULL;

    while(head!=NULL)
    {
        printf("%d  ",head->data);
        head=head->ptr;
    }
}