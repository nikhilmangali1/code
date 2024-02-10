public class RatInAMaze2 {
    public static void  funRatInAMaze2(int maze[][])
    {
        int n=maze.length;
        int path[][]=new int[n][n];
        printAllPaths(maze, 0, 0, path); 
    }
    public static void printAllPaths(int maze[][],int i,int j,int path[][])
    { 
        //check if i,j cell is valid or not
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1)
        {
            return;
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
               System.out.println();
            }
            System.out.println();
            path[i][j]=0;

            return;
        }

        //explaore top direction
        printAllPaths(maze, i-1, j, path);
        //rigth
        printAllPaths(maze, i, j+1, path);
        //down
        printAllPaths(maze, i+1, j, path);
        //left
        printAllPaths(maze, i, j-1, path);
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
        funRatInAMaze2(maze);
    }
}