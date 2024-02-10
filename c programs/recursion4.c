#include<stdio.h>
int fun(int n)                                  //nested recursion
{
    if(n>100)
    return n-10;
    else   
    return fun(fun(n+11));
}
void main()
{
    int k=fun(95);                                                   //if value<100 passed to the function then it returns 91, if the value is greather than 100 then it return "value-10"   
    printf("%d ",k);
}