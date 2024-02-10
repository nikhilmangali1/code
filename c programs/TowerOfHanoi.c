#include<stdio.h>
int TOH(int n,int a,int b,int c)
{
    if(n>0)
    {
        TOH(n-1,a,c,b);
        printf("\nMOVE disk from %d to %d ",a,c);
        TOH(n-1,b,a,c);
    }
}
void main()
{
    int n;
    printf("Enter no.of disks to be moved from Tower A to Tower B: ");
    scanf("%d",&n);
    TOH(n,1,2,3);
}