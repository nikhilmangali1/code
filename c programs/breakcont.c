//break and continue
#include<stdio.h>
#include<conio.h>
void main()
{
    int i,num=5;
    printf("BREAK STMT\n");
    for ( i = 1; i <=num; i++)
    {
        if (i==2)
        {
            break;/* code */
        }
         printf("%d\n",i);
    }
    printf("CONTINUE STMT\n");
    for ( i = 1; i <=num; i++)
    {
        if (i==2)
        {
            continue;/* code */
        }
        printf("%d\n",i);
    }
    
}