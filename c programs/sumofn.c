//sum of n numbers using recursion
#include<stdio.h>
int Adder(int n)
{
    if(n>0)
    {
    return n+Adder(n-1);
    }
}
void main()
{
    int n,sum;
    printf("enter n value to do sum:");
    scanf("%d",&n);
    sum=Adder(n);
    printf("Sum of n numbers:%d",sum);
}