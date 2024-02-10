public class RatInAMaze1 {
    public static boolean RatInAMaze1(int maze[][])
    {
        int n=maze.length;
        int path[][]=new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }
    public static boolean solveMaze(int maze[][],int i,int j,int path[][])
    {
        //check if i,j cell is valid or not
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1)
        {
            return false;
        }
        
        //include the cell in current path

        path[i][j]=1;

        //check destination cell
        if(i==n-1&&j==n-1)
        {
            //printing path of destination
            for(int a=0;a<n;a++)
            {
                for(int b=0;b<n;b++)
                {
                    System.out.print(path[a][b]+" ");
                }
               // System.out.println();
            }
            return true;
        }

        //explaore top direction
        if(solveMaze(maze, i-1, j, path))
        {
            return true;
        }
        //rigth
        if(solveMaze(maze, i, j+1, path))
        {
            return true;
        }
        //down
        if(solveMaze(maze, i+1, j, path))
        {
            return true;
        }
        //left
        if(solveMaze(maze, i, j-1, path))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
        boolean pathPossible=RatInAMaze1(maze);
        System.out.println(pathPossible);
    }
}
