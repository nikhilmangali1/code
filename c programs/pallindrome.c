#include<stdio.h>
int main()
{
    int n,x=0,rem=0,temp;
    printf("\nENter n value :");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {
        rem=n%10;
        x=(x*10)+rem;
        n=n/10;
    }
    printf("\n%d",x);
    if(temp==x)
    {
        printf("\n%d is pallindrome",temp);
    }
    else{
    printf("\n%d is not pallindrome",temp);
    }
    return 0;
}