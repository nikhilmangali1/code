#include<stdio.h>
#include<stdlib.h>
void main()
{
    int *p,*q;
    p=(int *)malloc(5*sizeof(int));
    q=(int *)malloc(10*sizeof(int));
    p[0]=50;
    p[1]=10;
    p[2]=20;
    p[3]=30;
    p[4]=40;
    for(int i=0;i<5;i++)
    {
        printf("%d ",p[i]);
    }
    printf("\nmoving all elements from p to q");
    for(int i=0;i<5;i++)
    {
        q[i]=p[i];
    }
    printf("\n");
    free(p);
    p=q;
    //nq=NULL;
    for(int i=0;i<5;i++)
    {
        printf("%d ",q[i]);
    }
}