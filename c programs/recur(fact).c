//recursion --- factorial of a number
#include<stdio.h>
int fact(int num)
{
    if(num==0)
    {
        return 0;
    }
    else if(num==1)
    {
        return 1;
    }
    else
    {
        return num*fact(num-1);
    }
}
void main()
{
    int n,res;
    printf("Enter a number to know its factorial:");
    scanf("%d",&n);
    res=fact(n);
    printf("Factorial of %d is %d",n,res);
}