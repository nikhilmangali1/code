#include<stdio.h>
#define max 100
int main()
{
    int a[max][max],n,edges;
    printf("\n Enter no.of vertices:");
    scanf("%d",&n);
    printf("\nEnter no.of edges:");
    scanf("%d",&edges);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=0;
        }
    }
    for(int k=0;k<edges;k++)
    {
        int u,v;
        printf("\nEnter edge:");
        scanf("%d%d",&u,&v);
        a[u][v]=1;
        a[v][u]=1;
    }
    printf("\n Adjacency matrix:\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    return 0;
}