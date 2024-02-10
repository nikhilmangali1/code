#include<stdio.h>
int main()
{
    int p,r;
    scanf("%d%d",&p,&r);
    int alloc[p][r],max[p][r],need[p][r],avail[r],finish[p];
    for(int i=0;i<p;i++)
    {
        for(int j=0;j<r;j++)
        {
            scanf("%d",&alloc[i][j]);
        }
    }
    for(int i=0;i<p;i++)
    {
        for(int j=0;j<r;j++)
        {
            scanf("%d",&max[i][j]);
        }
    }
    for(int i=0;i<r;i++)
    {
        scanf("%d",&avail[i]);
    }
    for(int i=0;i<p;i++)
    {
        for(int j=0;j<r;j++)
        {
            need[i][j]=max[i][j]-alloc[i][j];
        }
    }
    int count=0;
    int safe[p];
    while(count<p)
    {
        int found=0;
        for(int i=0;i<p;i++)
        {
            if(finish[i]==0)
            {
                int j=0;
                for(j=0;j<r;j++)
                {
                    if(need[i][j]>avail[j])
                    {
                        break;
                    }
                }
                if(j==r)
                {
                    for(int k=0;k<r;k++)
                    {
                        avail[k]=avail[k]+alloc[i][k];
                    }
                    safe[count]=i;
                    finish[i]=1;
                    count++;
                    found=1;
                }
            }
        }
        if(!found)
        {
            printf("\nUnsafe");
        }
    }
    if(count==p)
    {
        for(int i=0;i<p;i++)
        {
            printf("P%d",safe[i]);
            if(i!=p-1)
            {
                printf("->");
            }
        }
        printf("\n");
    }
}