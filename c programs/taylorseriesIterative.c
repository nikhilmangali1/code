#include<stdio.h>
double e(int x,int n);
void main()
{
    printf("  %lf",e(1,10));
}
double e(int x,int n)
{
    double s=1;
    int i;
    double num=1;
    double den=1;
    for(i=1;i<=n;i++)
    {
        num*=1;
        den*=1;
        s+=num/den;
    }
    return s;
}