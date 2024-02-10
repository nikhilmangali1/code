#include<stdio.h>
struct student
{
    char name[20];
};
void main()
{
    struct student s[3];
    printf("ENter some names:");        ///didn't executed
    for(int i=0;i<3;i++)
    {
        scanf("%s",&s->name[i]);
    }
    /*printf("\nNAMES ARE:\n");
    for(int i=0;i<3;i++)
    {
        printf("\n%s\n",s->name[i]);
    }*/
    printf("\nNAMES AFTER NUMBERING:");
    for(int i=0;i<3;i++)
    {
        printf("\n%d.%s\n",i,s->name[i]);
    }
}