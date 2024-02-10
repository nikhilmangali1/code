#include<stdio.h>
int binarySearchRecursive(int *,int,int,int);
int main()
{
    int a[100],n,key,low,high,retV,temp;
    printf("\nENter n:");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\nElements are :");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    printf("\nAfter sorting:\n");
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    printf("\nENter  key value to search in the list:");
    scanf("%d", &key);
    retV=binarySearchRecursive(a, key, 0,n-1);
    if(retV==-1)
    {
        printf("\n%d is not found",key);
    }
    else
    {
        printf("\n%d is found at index %d ",key,retV);
    }
    return 0;
}
int binarySearchRecursive(int a[],int key,int low,int high)
{
    int mid;
    if(low>high)
    {
        return -1;
    }
    mid=(low+high)/2;
    if(a[mid]==key)
    {
        return mid;
    }
    if(key>a[mid])
    {
        return binarySearchRecursive(a,key,mid+1,high);
    }
    if(key<a[mid])
    {
        return binarySearchRecursive(a,key,low,mid-1);
    }
}