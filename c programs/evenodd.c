#include<stdio.h>
#include<conio.h>
int main()
{
    int a;
    printf("enter a value:");
    scanf("%d",&a);
    if(a%2==0)
    {
        printf("%d is even number",a);
    }
    printf("%d is odd number",a);
    return 0;
}