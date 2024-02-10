#include<stdio.h>
void funA(int);
void funB(int);
void main()
{
    int x=20;
    funB(x);
}
void funA(int n)
{
    if(n>0)
    {
        printf("%d ",n);
        funB(n-1);                              //indirect recursion
    }
}
void funB(int n)
{
    if(n>0);
    {
        printf("%d ",n);
        funA(n/2);
    }
}