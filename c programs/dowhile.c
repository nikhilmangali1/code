//do-while5
#include<stdio.h>
#include<conio.h>
void main()
{
    int num,i=1,res=1;
    //clrscr();
    printf("Enter num value:");
    scanf("%d",&num);
    do 
    {
      res=res*i; 
       /* code */
      i++;
    } while (i<=num);
    printf("RESULT:%d",res);
    
}