#include<stdio.h>
void main()
{
    int a[20],n,sumE=0,sumO=0;
    printf("Enter no.of elements:");
    scanf("%d",&n);
    printf("Enter elements into the array::\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    //accessing even values of the array
    printf("\n\n");
     for(int i=0;i<n;i++)
    {
        if(a[i]%2==0)
        {
            printf("%d \t",a[i]);
            sumE=sumE+a[i];
        }
    }
    //accessing odd values of the array
    printf("\n\n");
     for(int i=0;i<n;i++)
    {
        if(a[i]%2!=0)
        {
            printf("%d \t",a[i]);
            sumO=sumO+a[i];
        }
    }
    printf("\nSum of even values : %d \n",sumE);
    printf("\nSum of odd values : %d \n",sumO);
    return;
}
