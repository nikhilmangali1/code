//accessing  array elements in different ways
#include<stdio.h>
int main()
{
    int a[10],n,*p,i=0,j=0,k=0,l=0,m=0;
    p=a;
    printf("\nENter sizeof the array:");
    scanf("%d",&n);
    printf("\nEnter elements in to the array:");
    while(i<n)
    {
        printf("\nEnter %d th element:",i+1);
        scanf("%d",&a[i]);
        i++;
    }
    printf("\n\n");
    //accessing:1
    while(j<n)
    {
        printf("\n%d th element of the array: %d",j+1,a[j]);
        j++;
    }
    printf("\n\n");
    //accessing:2
    while(k<n)
    {
        printf("\n%d th element of the array: %d",k+1,p[k]);
        k++;
    }
    printf("\n\n");

    //accessing:3
    while(l<n)
    {
        printf("\n%d th element of the array: %d",l+1,*(p+l));
        l++;
    }
    printf("\n\n");

    //accessing:4
    while(m<n)
    {
        printf("\n%d th element of the array: %d",m+1,*(a+m));
        m++;
    }
    printf("\n\n");
}