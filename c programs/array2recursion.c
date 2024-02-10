#include<stdio.h>
void enter(int a[],int n);
void disp(int a[],int n);
int findlarge(int a[],int j,int k);
int l;
void main()
{
    int a[20],i,n;
    l=a[0];
    printf("ENter no.of values:");
    scanf("%d",&n);
    enter(a,n);
    disp(a,n);
    findlarge(a,i,n);
    disp(a,n);
}
int  findlarge(int a[],int j,int n)        ///////doesn't execuete
{
    if(a[j]>l)
    {
        return a[j];
    }
    else{
        return findlarge(a,j+1,n);
    }
}
void enter(int a[],int n)
{
    printf("Enter values in array:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
}
void disp(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("Array index of %d is->%d\n",i,a[i]);
    }
}