#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b;
    printf("Enter two values:");
    scanf("%d%d",&a,&b);
    printf("ARITHMETIC OPERATORS:\n");
    printf("%d+%d=%d\n",a,b,(a+b));
    printf("%d-%d=%d\n",a,b,(a-b));
    printf("%d*%d=%d\n",a,b,(a*b));
    printf("%d/%d=%d\n",a,b,(a/b));
    printf("%d%%d=%d\n",a,b,(a%b));
    printf("\n");
    printf("RELATIONAL OPERATORS:\n");
    printf("%d>%d=%d\n",a,b,(a>b));
    printf("%d<%d=%d\n",a,b,(a<b));
    printf("%d>=%d=%d\n",a,b,(a>=b));
    printf("%d<=%d=%d\n",a,b,(a<=b));
    printf("%d==%d=%d\n",a,b,(a==b));
    printf("%d!=%d=%d\n",a,b,(a!=b));
    printf("\n");
    printf("LOGICAL OPERATORS:\n");
    printf("%d&&%d=%d\n",a,b,(a&&b));
    printf("%d||%d=%d\n",a,b,(a||b));
    //printf("%d!%d=%d\n",a,b,(a!b));
    printf("\n");
    printf("BITWISE OPERATORS:\n");
    printf("%d>>%d=%d\n",a,b,(a>>b));
    printf("%d<<%d=%d\n",a,b,(a<<b));
    printf("%d&%d=%d\n",a,b,(a&b));
    printf("%d|%d=%d\n",a,b,(a|b));
    //printf("%d!%d=%d\n",a,b,(a!b));
    printf("~%d=%d\n",a,(~a));
    printf("\n");
    return 0;
}