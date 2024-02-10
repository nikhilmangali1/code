#include<stdio.h>
#include<conio.h>
struct students
{
    char name[20];
    int rollno;
    int marks;
};
void bubblesor(struct students prg[],int n);
void display(struct students grp[],int n);
void main()
{
    struct students s[20];
    int n;
    printf("Enter no.of students:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        printf("Enter %d student name:",i);
        scanf("%s",&s[i].name);
        printf("Enter %d student rollno:",i);
        scanf("%d",&s[i].rollno);
        printf("Enter %d student marks",i);
        scanf("%d",&s[i].marks);
        printf("\n");
    }
    display(s,n);
    bubblesort(s,n);
    printf("\nAfter sorting :\n");
    display(s,n);
}
void bubblesort(struct students prg[],int n)
{
    int i,j;
    struct students temp;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<(n-1-i);j++)
        {
            if(prg[j].marks>prg[j+1].marks)
            {
                temp=prg[j];
                prg[j]=prg[j+1];
                prg[j+1]=temp;
            }
        }
    }
}
void display(struct students grp[],int n)
{
    for(int j=1;j<=n;j++)
    {
        printf("\n@%d name:%s\trollno:%d\tmarks:%d\n",j,grp[j].name,grp[j].rollno,grp[j].marks);
    }
}