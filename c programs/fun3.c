//function with arguments and no return value
#include<stdio.h>
#include<conio.h>
int main()
{
    int rad;
    printf("Enter radius of the circle:");
    scanf("%d",&rad);
    cir_Area(rad);
    return 0;
}
void cir_Area(int rad)
{
    float pi=3.14;
    float res=pi*rad*rad;
    //printf("%f",pi);
    printf("Area of the circle:%f",res);
}