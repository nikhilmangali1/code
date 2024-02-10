#include<stdio.h>
int fib(int n)
{
    int t0=0,t1=1,s,i;
    if(n<=1)
    {
        return n;
    }
    else
    {
        for(i=1;i<n;i++)
        {
            s=t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }
}
void main()
{
    printf("%d  ",fib(10));
}