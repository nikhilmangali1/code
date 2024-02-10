#include<stdio.h>
#include<stdlib.h>
struct student 
{
    int roll;
    float marks;
};
int main()
{
    //struct student s;
    struct student *ptr;
    ptr=(struct student*)malloc(sizeof(struct student));
    ptr->roll=507;
    ptr->marks=99.99;
     printf("marks of the student is %f \n and his roll no is %d",ptr->marks,ptr->roll);
    printf("\nENter values:\n");
    scanf("%f%d",&ptr->marks,&ptr->roll);
    printf("marks of the student is %f \n and his roll no is %d",ptr->marks,ptr->roll);
}