#include<stdio.h>
int recursiveLinearSearch(int *,int key,int,int right);
int main()
{
    int a[100],n,key,retV;
    printf("\nENter n:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nENter key to search:");
    scanf("%d",&key);
    retV=recursiveLinearSearch(a,key,0,n-1);
    if(retV==1)
    {
        printf("\n%d is found",key);
    }
    if(retV!=2)
    {
        printf("\n %d is not found",key);
    }
    return 0;
}
int recursiveLinearSearch(int a[],int key,int left,int right)
{
    if(left>right)
    {
        return 2;
    }
    if(a[left]==key)
    {
        return 1;
    }
    return recursiveLinearSearch(a,key,left+1,right);
}