#include <stdio.h>
void binarySearch();
int a[100], n, temp, key, low, mid, high;
int main()
{
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
    binarySearch(a, n, key);
    return 0;
}
void binarySearch()
{
    low = 0;
    high = n - 1;
    while (high >= low)
    {
        mid = (low + high) / 2;
        if (key == a[mid])
        {
            break;
        }
        else
        {
            if (key > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }
    if (key == a[mid])
    {
        printf("\n%d is found ", key);
    }
    else
    {
        printf("\n%d is not found ", key);
    }
}