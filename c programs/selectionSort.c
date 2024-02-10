#include<stdio.h>
void selectionSort(int *,int);
void display(int *,int);
int main()
{
    int a[30],n;
    printf("\nENter n:");
    scanf("%d",&n);
    printf("\nENter....");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nElements before sort:");
    display(a,n);
    selectionSort(a,n);
    printf("\nElements after sort:");
    display(a,n);
    return 0;
}
void display(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
}
void selectionSort(int a[],int n)
{
    int minInd,temp;
    for(int i=0;i<n;i++)
    {
        minInd=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[minInd])
            {
                minInd=j;
            }
        }
        temp=a[i];
        a[i]=a[minInd];
        a[minInd]=temp;
    }
}