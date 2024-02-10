#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void display(int);
void stringSort(int);
struct StudentRoll
{
    char roll[12];
};
struct StudentRoll *s;
void display(int capacity)  
{
    for(int i=0;i<capacity;i++)
    {
        printf("\n%s",s[i].roll);
    }
}
void stringSort(int capacity)
{
    char temp[12];
    for(int i=0;i<capacity;i++)
    {
        for(int j=0;j<capacity-1-i;j++)
        {
            if(strcmp(s[j].roll,s[j+1].roll)>0)
            {
                strcpy(temp,s[j].roll);
                strcpy(s[j].roll,s[j+1].roll);
                strcpy(s[j+1].roll,temp);
            }
        }
    }
}
int main()
{
    int capacity=0;
    printf("\nENter the count of Student roll numbers to sort:");
    scanf("%d",&capacity);
    s=(struct StudentRoll*)malloc(capacity*sizeof(struct StudentRoll));
    printf("\nENter student roll numbers to sort:\n");
    for(int i=0;i<capacity;i++)
    {
        printf("%d->",i+1);
        scanf("%s",&s[i].roll);
    }
    printf("\nRoll Numbers before sorting: ");
    display(capacity);
    stringSort(capacity);
    printf("\nRoll Numbers after sorting: ");
    display(capacity);
    return 0;
}