import java.util.Scanner;
class Rat
{
    public Boolean canRatEscape(int N,int maze[][],int path[][],int i,int j)
    {
        if(i==N-1&&j==N-1)
        {
            path[i][j]=1;
            return true;
        }
        if(i>=0&&j>=0&&i<N&&j<N&&maze[i][j]==1)
        {
            path[i][j]=1;
            if (canRatEscape(N, maze, path, i, j + 1))
            {return true;}
            if (canRatEscape(N, maze, path, i + 1, j))
            {return true;}
            path[i][j] = 0;
        }
        return false;
    }
}
public class RatInAMaze
{
    public static void main(String[] args) {
        Rat r=new Rat();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter N");
        int N=s.nextInt();
        int maze[][]=new int[N][N];
        System.out.println("Maze Matrix:");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                maze[i][j]=s.nextInt();
            }
        }
        int pathVisisted[][]=new int[N][N];
        Boolean b=r.canRatEscape(N, maze, pathVisisted,0,0);
        System.out.println(b);
        s.close();
    }
}