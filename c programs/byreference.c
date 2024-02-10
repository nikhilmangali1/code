// function call by reference
#include<stdio.h>
void disp(int *ptr)
{
    printf("in function before entering new value :%d\n",*(ptr));
    printf("ENter value again in function:");
    scanf("%d",&(ptr));
    printf("in function:%d\n",*ptr);
}
void main()
{
    int a;
    printf("Enter a value:");
    scanf("%d",&a);
    printf("value:%d\n",a);
    printf("Address of a:%u\n",&a);
    disp(&a);
    printf("value:%d\n",a);         //value doesn't change here?!
}
