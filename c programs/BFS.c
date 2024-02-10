#include<stdio.h>
int a[20][20],q[20],visited[20],n,f=0,r=-1;
void BFS(int n)
{
    for(int i=1;i<=n;i++)
    {
        if(a[f][i]&&!visited[i])
        {
           q[++r]=i;
        }
        if(f<=r)
        {
            visited[q[f]]=1;
            BFS(q[f++]);
        }
    }
}
int main()
{
    int v;
    printf("\nEnter no.of vertices:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        q[i]=0;
        visited[i]=0;
    }
    printf("\nEnter graph data in matrix form:");
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nEnter the starting vertex:");
    scanf("%d",&v);
    BFS(v);
    printf("\nIn the node which are reachable are :");
    for(int i=1;i<=n;i++)
    {
        q[i]=0;
        visited[i]=0;
    }
    for(int i=1;i<=n;i++)
    {
        if(visited[i])
        {
            printf("%d\t",i);
        }
    }
    for(int i=1;i<=n;i++)
    {
        if(!visited[i])
        {
            printf("\nBFS  is not possible ,not all nodes are reachable\n");
            break;
        }
    }
    return 0;
}