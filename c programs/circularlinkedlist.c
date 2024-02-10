#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
struct node
{
    int data;
    struct node *ptr;
};
struct node *create(struct node *);
void display(struct node *);
void Node_No(struct node *);
bool search(struct node *, int);
void count(struct node *);
void insert_At_End(struct node *);
void insert_At_Begin(struct node **, struct node *);
void insert_At_Middle_After_Reference(struct node *);
void insert_At_Middle_Before_Reference(struct node *);
void delete_Last_Node(struct node *);
void delete_Node_Of_Entered_Element(struct node *);
struct node *delete_First_Node(struct node *);
int main()
{
    struct node *head = NULL;
    int key, choice;
    bool res;
    head = create(head);
    display(head);
    printf("\nEnter 1-10 to do a particular operation\nAND ENter -2 to stop doing operations :\n");
    while (1)
    {
        printf("\nENter 1 to know Node number of enetered element:");
        printf("\nENter 2 to to search an element:");
        printf("\nENter 3 to know toatal elements/nodes in the circular linked list:");
        printf("\nENter 4 to insert an element at the end of the linked list:");
        printf("\nENter 5 to insert an element at the beginning of the linked list:");
        printf("\nENter 6 to insert an element in the linked list after a reference element");
        printf("\nENter 7 to insert an element in the linked list before reference element:");
        printf("\nENter 8 to delete last node of the linked list:");
        printf("\nENter 9 to delete the node of entered element:");
        printf("\nENter 10 to delete first node of the element:\t");
        scanf("%d", &choice);
        if (choice == -2)
            break;
        switch (choice)
        {
        case 1:
        {
            Node_No(head);
            break;
        }
        case 2:
        {
            printf("\nENter an element to know whether it is present or not in the linked list:");
            scanf("%d", &key);
            res = search(head, key);
            if (res == 1)
            {
                printf("\nElement is present in the linked list!\n");
            }
            if (res == 0)
            {
                printf("\nElement is not present in the linked list!\n");
            }
            break;
        }
        case 3:
        {
            count(head);
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
            insert_At_Begin(&head, head);
            display(head);
            break;
        }
        case 6:
        {
            insert_At_Middle_After_Reference(head);
            display(head);
            break;
        }
        case 7:
        {
            insert_At_Middle_Before_Reference(head);
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
            delete_Node_Of_Entered_Element(head);
            display(head);
            break;
        }
        case 10:
        {
            head = delete_First_Node(head);
            display(head);
            break;
        }
        default:
        {
            printf("\n\nINVALID OPERATION\n\n");
            break;
        }
        }
    }
    return 0;
}
struct node *create(struct node *h)
{
    struct node *temp = NULL, *bef = NULL;
    int e;
    printf("\nENter values into circular single list:\nAND\nENter -1 to get out of the loop:");
    while (-111)
    {
        scanf("%d", &e);
        if (e == -1)
            break;
        temp = (struct node *)malloc(sizeof(struct node));
        temp->data = e;
        temp->ptr = NULL;
        if (h == NULL)
        {
            h = temp;
            temp->ptr = h;
        }
        else
            bef->ptr = temp;
        temp->ptr = h;
        bef = temp;
    }
    return h;
}
void display(struct node *h)
{
    printf("\n\n");
    struct node *headValue = h;
    do
    {
        printf("%d\t", h->data);
        h = h->ptr;
    } while (h != headValue);
    printf("\n\n");
}
bool search(struct node *h, int key)
{
    struct node *headValue = h;
    do
    {
        if (h->data == key)
        {
            return 1;
        }
        h = h->ptr;
    } while (h != headValue);
    return 0;
}
void count(struct node *h)
{
    struct node *headValue = h;
    int c = 0;
    do
    {
        c = c + 1;
        h = h->ptr;
    } while (h != headValue);
    printf("\nTotal nodes are %d \n", c);
}
void insert_At_End(struct node *h)
{
    struct node *temp = NULL, *headValue = h;
    int e;
    printf("\nEnter an element to be inserted at the end of the linked list:");
    scanf("%d", &e);
    do
    {
        h = h->ptr;
    } while (h->ptr != headValue);
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->ptr = NULL;
    h->ptr = temp;
    temp->ptr = headValue;
}
void insert_At_Begin(struct node **ah, struct node *m)
{
    struct node *temp = NULL, *headValue = m;
    int e;
    printf("\nEnter an element to be inserted at the beginning of the linked list:");
    scanf("%d", &e);
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->ptr = *ah;
    *ah = temp;
    do
    {
        m = m->ptr;
    } while (m->ptr != headValue);
    m->ptr = temp;
}
void insert_At_Middle_After_Reference(struct node *h)
{
    struct node *temp = NULL;
    int e, ref;
    bool retValue;
    printf("\nENter an element to be inserted in the linked list after reference element:");
    scanf("%d", &e);
    printf("\nEnter reference element:");
    scanf("%d", &ref);
    retValue = search(h, ref);
    if (retValue == 1)
    {
        printf("\nEntered reference element is present in the linked list!\n");
        while (h->data != ref)
        {
            h = h->ptr;
        }
        temp = (struct node *)malloc(sizeof(struct node));
        temp->data = e;
        temp->ptr = NULL;
        temp->ptr = h->ptr;
        h->ptr = temp;
    }
    if (retValue == 0)
    {
        printf("\nEntered reference element is not present in the linked list!\n");
    }
}
void insert_At_Middle_Before_Reference(struct node *h)
{
    struct node *temp = NULL, *dummy = NULL;
    int e, ref;
    bool retValue;
    printf("\nENter an element to be inserted in the linked list before reference element:");
    scanf("%d", &e);
    printf("\nEnter reference element:");
    scanf("%d", &ref);
    retValue = search(h, ref);
    if (retValue == 1)
    {
        printf("\nEntered reference element is present in the linked list!\n");
        do
        {
            dummy = h;
            h = h->ptr;
        } while (h->data != ref);
        temp = (struct node *)malloc(sizeof(struct node));
        temp->data = e;
        temp->ptr = NULL;
        temp->ptr = dummy->ptr; // temp->ptr=h;
        dummy->ptr = temp;
    }
    if (retValue == 0)
    {
        printf("\nEntered reference element is not present in the linked list!\n");
    }
}
void delete_Last_Node(struct node *h)
{
    struct node *headValue = h, *temp = NULL;
    do
    {
        temp = h;
        h = h->ptr;
    } while (h->ptr != headValue);
    temp->ptr = headValue;
    free(h);
    printf("\nCircular linked list after deleting last node:\n");
}
void delete_Node_Of_Entered_Element(struct node *h)
{
    struct node *headValue = h, *temp = NULL;
    int e;
    printf("\nENter an element to delete that respective node:");
    scanf("%d", &e);
    do
    {
        temp = h;
        h = h->ptr;
    } while (h->data != e);
    temp->ptr = h->ptr;
    free(h);
}
struct node *delete_First_Node(struct node *h)
{
    struct node *headValue = h, *temp = NULL;
    temp = h->ptr;
    do
    {
        h = h->ptr;
    } while (h->ptr != headValue);
    h->ptr = temp;
    printf("\nAfter deleting first node of the linked list:\n");
    return temp;
}
void Node_No(struct node *h)
{
    int e, no = 1;
    bool retValue;
    printf("\nENter an element to to know its node number/position:");
    scanf("%d", &e);
    retValue = search(h, e);
    if (retValue == 1)
    {
        printf("\nElement is present in the linked list!\n");
        do
        {
            no++;
            h = h->ptr;
        } while (h->data != e);
        printf("\nEntered element %d node number/position is %d \n", h->data, no);
    }
    if (retValue == 0)
    {
        printf("\nElement is not present in the linked list!\n");
    }
}