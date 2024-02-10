#include<stdio.h>
int rec(int*,int,int,int);
int main()
{
    int a[5]={1,2,3,4,5};
    int key,r;
    scanf("%d",&key);
    r=rec(a,key,0,5-1);
    if(r==1)
    {
        printf("\nyes");
    }
    if(r==2)
    {
        printf("\nno");
    }
    return 0;
}
int rec(int a[],int key,int left,int right)
{
    if(left>right)
    {
        return 2;
    }
    if(a[left]==key)
    {
        return 1;
    }
    return rec(a,key,left+1,right);
}