#include<stdio.h>
void fun1(int n)
{
    if(n>0)
    {
        printf("%d ",n);                //printing is executed at calling time/ascending time
        fun1(n-1);
    }
}
void fun2(int n)
{
    if(n>0)
    {
        fun2(n-1);
        printf("%d ",n);                //printing is executed at returning time/descending time
       
    }
}
void main()
{
    int x=3;
    fun1(x);
    printf("\n");
    fun2(x);
}