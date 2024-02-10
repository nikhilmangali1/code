#include<stdio.h>
int fact(int);
int main()
{
    /*int n=5;
    int i,fact=1;
    for(i=n;i>=1;i--)
    {
        fact=fact*i;
    }
    printf("%d",fact);
    return 0;*/
    int n=5,k;
    k=fact(n);
    printf("%d",k);
}
int fact(int n)
{
    if(n==0||n==1)
    return 1;
    else
    return fact(n-1)*n;
}