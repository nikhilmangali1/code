//recursion --- factorial of a number
#include<stdio.h>
int fact(int num)
{
    if(num==0||num==1)
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
    while(1)
    {
    int n,res;
    printf("Enter a number to know its factorial:");
    scanf("%d",&n);
     if(n==143)
    {
        printf("ah number kakunda vere number enter chey");
        break;
    }
    res=fact(n);
    printf("Factorial of %d is %d\n",n,res);
    }
}