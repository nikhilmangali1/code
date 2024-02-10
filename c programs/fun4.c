//funtion with arguments and return value
#include<stdio.h>
#include<conio.h>
float Add(int a,int b)
{
    return a+b;
}
float Dif(int a,int b)
{
    return a-b;
}
float Pro(int a,int b)
{
    return a*b;
}
float Div(int a,int b)
{
    return a/b;
}
void main()
{
    int a,b;
    float sum,sub,product,div;
    printf("Enter two values:");
    scanf("%d%d",&a,&b);
    sum=Add(a,b);
    sub=Dif(a,b);
    product=Pro(a,b);
    div=Div(a,b);
    printf("Sum:%f\n",sum);
    printf("difference:%f\n",sub);
    printf("Multiplication:%f\n",product);
    printf("Division:%f\n",div);
}
