#include<stdio.h>
void main()
{
    int a[20],n,sum;
    printf("Enter no.of elements:");
    scanf("%d",&n);
    printf("Enter elements into the array::\n");
    for(int i=0;i<n;i++)
    {
        printf("Enter elements in index of %d::",i);
        scanf("%d",&a[i]);
    }
    sum=0;
        if(n==0)
        {
            printf("sum of elements in array:%d",sum);
        }
        else{
            for(int i=0;i<n;i++)
            {
                sum=sum+a[i];
            }
            printf("sum of elements in array:%d",sum);   
        }
}