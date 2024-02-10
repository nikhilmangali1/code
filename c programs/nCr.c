#include<stdio.h>
int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    return fact(n-1)*n;
}
int nCr(int n,int r)
{
    int num,den;
    num=fact(n);
    den=fact(r)*fact(n-r);
    return num/den;
}
int ncr(int n,int r)
{
    if(r==0||n==r)
    {
        return 1;
    }
    return ncr(n-1,r-1)+(n,r-1);
}
void main()
{
printf("%d \n",nCr(5,3));
printf("%d \n",ncr(5,3));
}