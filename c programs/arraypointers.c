#include<stdio.h>
void main()
{
    int a[100],*ptr;
   // ptr=a;        //  ptr=a   or ptr=&a[0] . BOTH ARE SAME AND CORRECT
   ptr=&a[0];
    printf("Enter values into the array:\n");
    for(int i=1;i<=5;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nvalues are:");
    for(int j=1;j<=5;j++)
    {
        printf("\n%d",ptr[j]);
    }
    printf("\nvalues are:");
    for(int j=1;j<=5;j++)
    {
        printf("\n%d",a[j]);
    }
}