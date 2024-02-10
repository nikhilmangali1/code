//even and odd using loop
#include<stdio.h>
#include<conio.h>
void main()
{
    int num,i;
    printf("Enter any value:");
    scanf("%d",&num);
    printf("--EVEN NUMBERS--\n\n");
    for (i=1;i<=num;i++)
    {
        if(i%2==0)
        printf("%d is even\n",i);/* code */
    }
    printf("---ODD NUMBERS---\n\n");
     for (i=1;i<=num;i++)
    {
        if(i%2!=0)
        printf("%d is odd\n",i);/* code */
    }
    
}