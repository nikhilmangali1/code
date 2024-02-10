#include<stdio.h>
int main()
{
    int n,rem=0,temp,sum=0;
    printf("\nEnter n value:");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {
        rem=n%10;
        sum=((sum)+(rem*rem*rem));
        n=n/10;
    }
    printf("\nsum is %d ",sum);
    if(sum==temp)
    {
        printf("\nentered n->%d and sum->%d are equal\n ",temp,sum);
    }
    else{
    printf("\nthey are not same\n");
    }
    return 0;
}