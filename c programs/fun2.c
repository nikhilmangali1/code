// funtion with return type and no arguements
#include<stdio.h>
#include<conio.h>
int findArea();
void main()
{
    int area;
    area=findArea();
    printf("Area of the square:%d",area);
}
int findArea()
{
    int side;
    printf("Enter side of the square:");
    scanf("%d",&side);
    return side*side;
}