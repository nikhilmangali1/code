#include<stdio.h>
double e(int x,int n)
{
    static int p=1,f=1;
    int r;
    if(r==0)
    return 1;
    else{
        r=e(x,n-1);
        p=p*x;
        f=f*n;
        return r+p/f;
    }
}
void main()
{
  printf("\ntailer series =%lf \n",e(1,10));
}