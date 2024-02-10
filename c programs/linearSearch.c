#include <stdio.h>
int linearSearch(int *, int, int);
int main()
{
    int a[100], n, key, ret;
    printf("\nENter count of elements:");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\nELements are:");
    for (int i = 0; i < n; i++)
    {
        printf("\n%d", a[i]);
    }
    printf("\nEnter key to search in the list:");
    scanf("%d", &key);
    ret = linearSearch(a, key, n);
    if (ret == 1)
    {
        printf("\n %d is present in the list", key);
    }
    if (ret == 2)
    {
        printf("\n %d is not present in the list", key);
    }
    return 0;
}
int linearSearch(int a[], int key, int n)
{
    for (int i = 0; i < n; i++)
    {
        if (a[i] == key)
        {
            return 1;
        }
    }
    return 2;
}