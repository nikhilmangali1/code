#include<stdio.h>
void fun(int n)
{
    if(n>0)
    {
        printf("%d ",n);
        fun(n-1);
        fun(n-1);               //tree recursion
    }
}
void main()
{
    int x=2;
    fun(x);
}