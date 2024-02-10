#include<stdio.h>
void bubbleSort(int *,int);
void display(int*,int);
int main()
{
    int a[100],n;
    printf("\nEnter n:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nElements before sorting:");
    display(a,n);
    bubbleSort(a,n);
    printf("\nElements after sorting:");
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
void bubbleSort(int a[], int n) {
    int i, j, key;
    for (i = 1; i < n; i++) {
        key = a[i];
        j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
}