#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
struct node
{
    int data;
    struct node *prev;
    struct node *next;
};
struct node *create(struct node *);
void display(struct node *);
void insert_At_Begin(struct node *, struct node **);
void insert_At_End(struct node *);
void insert_Middle_After_Reference(struct node *);
void insert_Middle_Before_Reference(struct node *);
void delete_Last_Node(struct node *);
void delete_Entered_Element_Node(struct node *);
struct node *delete_First_Node(struct node *);
bool search(struct node *, int);
void node_Position(struct node *);
void count(struct node *);
int main()
{
    struct node *head = NULL;
    int choice, key;
    bool b;
    head = create(head);
    display(head);
    while (1)
    {
        printf("\nENter any of the numbers of 1 to  10 to do desired opretion:");
        printf("\nENter 1 to insert an element at the beginning of the circular diubly linked list:");
        printf("\nENter 2 to insert an element at the end of the circular diubly linked list:");
        printf("\nENter 3 to insert an element in the circular diubly linked list before reference element:");
        printf("\nENter 4 to insert an element in the circular diubly linked list after reference element:");
        printf("\nENter 5 to delete node of respective element:");
        printf("\nEnter 6 to delete last node:");
        printf("\nENter 7 to delete first node:");
        printf("\nEnter 8 to to node number:");
        printf("\nENter 9 to know the total no.of nodes/elements present in the list:");
        printf("\nENter 10 to search an element:");
        scanf("%d", &choice);
        if (choice == -2)
            break;
        switch (choice)
        {
        case 1:
        {
            insert_At_Begin(head, &head);
            display(head);
            break;
        }
        case 2:
        {
            insert_At_End(head);
            display(head);
            break;
        }
        case 3:
        {
            insert_Middle_Before_Reference(head);
            display(head);
            break;
        }
        case 4:
        {
            insert_Middle_After_Reference(head);
            display(head);
            break;
        }
        case 5:
        {
            delete_Entered_Element_Node(head);
            display(head);
            break;
        }
        case 6:
        {
            delete_Last_Node(head);
            display(head);
            break;
        }
        case 7:
        {
            head = delete_First_Node(head);
            display(head);
            break;
        }
        case 8:
        {
            node_Position(head);
            break;
        }
        case 9:
        {
            count(head);
            break;
        }
        case 10:
        {
            printf("\nENter key to search :");
            scanf("%d", &key);
            b = search(head, key);
            if (b == 1)
            {
                printf("\nEnetered element %d is present in the linked list!\n");
            }
            if (b == 0)
            {
                printf("\nENtered element %d is not present in the list!\n");
            }
            break;
        }
        default:
        {
            printf("\n\nINVALID OPERATION!!\n\n");
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
    printf("\nENter elements into circular doubly list:\nAnd\nEnter -1 to stop entering:");
    while (1)
    {
        scanf("%d", &e);
        if (e == -1)
            break;
        temp = (struct node *)malloc(sizeof(struct node));
        temp->data = e;
        temp->prev = NULL;
        temp->next = NULL;
        if (h == NULL)
        {
            h = temp;
            temp->next = h;
            temp->prev = h;
        }
        else
        {
            bef->next = temp;
            temp->prev = bef;
            temp->next = h;
            h->prev = temp;
        }
        bef = temp;
    }
    return h;
}
void display(struct node *h)
{
    struct node *headValue = h;
    do
    {
        printf("%d\t", h->data);
        h = h->next;
    } while (h != headValue);
}
void insert_At_End(struct node *h)
{
    struct node *temp = NULL, *headValue = h;
    int e;
    printf("\nENter an element to be inserted at the end of the linked list:");
    scanf("%d", &e);
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->prev = NULL;
    temp->next = NULL;
    do
    {
        h = h->next;
    } while (h != headValue);
    temp->prev = h;
    temp->next = headValue;
    headValue->prev->next = temp;
    headValue->prev = temp;
}
void insert_At_Begin(struct node *h, struct node **ah)
{
    struct node *temp = NULL, *headValue = h;
    int e;
    printf("\nENter an element to be inserted at the beginning of the list:");
    scanf("%d", &e);
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->prev = NULL;
    temp->next = NULL;

    temp->next = *ah;
    do
    {
        h = h->next;
    } while (h->next != headValue);
    h->next = temp;
    headValue->prev = temp;
    *ah = temp;
}
void insert_Middle_After_Reference(struct node *h)
{
    struct node *temp = NULL, *headValue = h;
    int e, ref;
    printf("\nENter an element to be inserted in the list after reference element:");
    scanf("%d", &e);
    printf("\nENter reference element:");
    scanf("%d", &ref);
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->prev = NULL;
    temp->next = NULL;
    while (h->data != ref)
    {
        h = h->next;
    }
    temp->next = h->next;
    temp->prev = h;
    h->next = temp;
}
void insert_Middle_Before_Reference(struct node *h)
{
    struct node *temp = NULL, *headValue = h, *bef = NULL;
    int e, ref;
    printf("\nEnter an element to be inserted in the list before reference:");
    scanf("%d", &e);
    printf("\nENter reference element:");
    scanf("%d", &ref);
    while (h->data != ref)
    {
        bef = h;
        h = h->next;
    }
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = e;
    temp->prev = NULL;
    temp->next = NULL;
    temp->next = bef->next;
    temp->prev = bef;
    bef->next = temp;
    h->prev = temp;
}
void delete_Last_Node(struct node *h)
{
    struct node *headValue = h, *pri = NULL;
    while (h->next != headValue)
    {
        pri = h;
        h = h->next;
    }
    headValue->prev = pri;
    pri->next = headValue;
    free(h);
    printf("\nAfter deleting last node of the lined list:\n");
}
struct node *delete_First_Node(struct node *h)
{
    struct node *headValue = h, *temp = NULL;
    temp = h->next;
    do
    {
        h = h->next;
    } while (h->next != headValue);
    h->next = temp;
    printf("\nAfter deleting first node:\n");
    return temp;
}
void delete_Entered_Element_Node(struct node *h)
{
    struct node *headValue = h, *before = NULL;
    int e;
    printf("\nEnter an element in the list to delete that node:");
    scanf("%d", &e);
    while (h->data != e)
    {
        before = h;
        h = h->next;
    }
    before->next = h->next;
    h->next->prev = before;
    free(h);
}
bool search(struct node *h, int k)
{
    struct node *headValue = h;
    do
    {
        if (h->data == k)
            return 1;
        h = h->next;
    } while (h != headValue);
    return 0;
}
void node_Position(struct node *h)
{
    int pos = 1, e;
    struct node *headValue = h;
    printf("\nENter an element to know its position:");
    scanf("%d", &e);
    do
    {
        pos = pos + 1;
        h = h->next;
    } while (h->data != e);
    printf("\nENtered element %d position is %d\n ", h->data, pos);
}
void count(struct node *h)
{
    int cnt = 1;
    struct node *headValue = h;
    do
    {
        cnt = cnt + 1;
        h = h->next;
    } while (h!= headValue);
    printf("\nTotal nodes are %d\n ", cnt);
}