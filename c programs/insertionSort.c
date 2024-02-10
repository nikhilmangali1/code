#include <stdio.h>
void insertionSort(int *,int);
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
    insertionSort(a,n);
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
void insertionSort(int arr[], int n) {
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}