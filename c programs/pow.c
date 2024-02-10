#include<stdio.h>
/*int poww(int m,int n)
{
    if(n==0)                                    //this function for finding power works even better than below 
    return 1;
    if(n%2==0)
    return poww(m*m,n/2);
    else
    return m*poww(m*m,(n-1)/2);
}*/
int poww(int m,int n);
void main()
{
    int r=poww(2,5);
    printf("%d ",r);
}
int poww(int m,int n)
{
    if(n==0)
    return 1;
    else
    return poww(m,n-1)*m;
}