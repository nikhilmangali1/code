#include<stdio.h>
void main()
{
    int n,digits=0,rem;
    printf("Enter the value of n:");
    scanf("%d",&n);
    printf("\nEnter the value:%d",n);
    while(n>0)
    {
        rem=n%10;
        digits=digits+1;
        n=n/10;
    }
    printf("\nNo.of digits in the value is:%d",digits);
    printf("\nTotal no.of possibilities:%d",fact(digits));
}
int fact(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    else
    {
        return n*fact(n-1);
    }
}