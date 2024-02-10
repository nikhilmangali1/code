//swapping of two numbers
#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;
    printf("Enter a and b values:");
    scanf("%d%d",&a,&b);
    printf("values before swapping:%d and %d\n",a,b);
    swap(a,b);
    printf("Values after swapping:%d and %d\n",a,b);
}
void swap(int x,int y)
{
    int third;
    third=x;
    x=y;
    y=third;
    printf("values after swapping:%d and %d\n",x,y);
}
