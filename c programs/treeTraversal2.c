#include<stdio.h>
#include<stdlib.h>
struct node *create();
void inorder(struct node *);
void preorder(struct node *);
void postorder(struct node *);
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *create()
{
    struct node *temp;
    int x;
    printf("\nENter data and enter -1 to return no node:");
    scanf("%d",&x);
    if(x==-1)
    {
        return NULL;
    }
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    printf("\nEnter left child of %d \n",x);
    temp->left=create();
    printf("\nENter right child of %d \n",x);
    temp->right=create();
    return temp;
}
void inorder(struct node *r)
{
    if(r!=NULL)
    {
        inorder(r->left);
        printf("%d\t",r->data);
        inorder(r->right);
    }
}
void preorder(struct node *r)
{
    if(r!=NULL)
    {
        printf("%d\t", r->data);
        preorder(r->left);
        preorder(r->right);
    }
}
void postorder(struct node *r)
{
    if(r!=NULL)
    {
        postorder(r->left);
        postorder(r->right);
        printf("%d\t", r->data);
    }
}
int main()
{
    struct node *root=NULL;
    root=create();
    printf("\n\nINORDER TRAVERSAL\n\n");
    inorder(root);
    printf("\n\nPREORDER TRAVERSAL\n\n");
    preorder(root);
    printf("\n\nPOSTORDER TRAVERSAL\n\n");
    postorder(root);
    return 0;
}