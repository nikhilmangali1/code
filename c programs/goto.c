//goto and label
#include<stdio.h>
void main()
{
    int i;
    for(i=1;i<=5;i++)
    {
        goto SAI;
    }
    SAI:
    printf("hi ra sai!!");
    exit(0);
}
