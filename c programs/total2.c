#include<stdio.h>
void print(int *a,int n);
void main()
{
    int n,a[10],i,j,temp;
    printf("\nEnter how many number you want to enter:");
    scanf("%d",&n);
    printf("\nEnter the number:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nEntered number:");
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
    printf("\n");
    //for knowing all combinations
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-1;j++)
        {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            print(a,n);
        }
    }
}
void print(int *a,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
    printf("\n");
}