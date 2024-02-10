#include<stdio.h>
double e(int x,int n)
{
    static int s=1;
    if(n==0)
    return s;
    else{
        s=1+s/n*1;
        return e(x,n-1);
    }
}
void main()
{
    printf("   taylor series  %lf ",e(5,10));
}