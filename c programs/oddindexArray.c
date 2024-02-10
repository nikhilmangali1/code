#include<stdio.h>
void main()
{
    int a[20],n,sumEI=0,sumOI=0;
    printf("Enter no.of elements:");
    scanf("%d",&n);
    printf("Enter elements into the array::\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    //accessing even index values of the array
    printf("\n\n");
    for(int i=0;i<n;i++)
    {
        if(i%2==0)
        {
            printf("%d\t",a[i]);
            sumEI=sumEI+a[i];
        }
    }
     //accessing odd index values of the array
    printf("\n\n");
    for(int i=0;i<n;i++)
    {
        if(i%2!=0)
        {
            printf("%d\t",a[i]);
            sumOI=sumOI+a[i];
        }
    }
    printf("\nSum of even values : %d \n",sumEI);
    printf("\nSum of odd values : %d \n",sumOI);
    return;
}