#include<stdio.h>
int linear(int *,int);
int main()
{
    int k,a[5]={1,2,3,4,5};
    int key;
    printf("\nEnter key\n");
    scanf("%d",&key);
    k=linear(a,key);
    if(k==1)
    {
        printf("\nyes");
    }
    if(k==2)
    {
        printf("\nno");
    }
    return 0;
}
int linear(int a[],int key)
{
    for(int i=0;i<5;i++)
    {
        if(key==a[i])
        {
            return 1;
        }
    }
    return 2;
}