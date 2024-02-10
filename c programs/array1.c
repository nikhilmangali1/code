#include<stdio.h>
#include<conio.h>
void main()
{
    int ar[20],n,small,large;
   // clrscr();
    printf("ENter no.of values:");
    scanf("%d",&n);
    printf("Enter values in array:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
     for(int i=0;i<n;i++)
    {
        printf("index of %d is %d\n",i,ar[i]);
    }
    printf("smallest and largest of array\n\n:");
    small=ar[0];
    for(int i=0;i<n;i++)
    {
        if(ar[i]<small)
        {
            small=ar[i];
        }
    }
    printf("\n\n");
    printf("Smallest element in array is %d\n\n",small);
    large=ar[0];
    for(int i=0;i<n;i++)
    {
        if(ar[i]>large)
        {
            large=ar[i];
        }
    }
    printf("Largest element in array is %d",large);
    getch();
}