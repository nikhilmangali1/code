/**
 * 
 * BRUTE-FORCE METHOD
 * Time Complexity --- (n*m)*(n*m)+(n*m)
 *                  -----nearly O(n^3)
 * 
 * Here, we first convert every row and column that contain zeroe(0) 
 * and again Zeroes will be converting into -1 then converting into 0
 */


public class SetMatrixZeroes__BruteForce {
    public static void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    markRow(i,matrix);
                    markColumn(j,matrix);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        printMatrix(matrix);
    }
    private static void markRow(int i,int[][] matrix)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }

    private static void markColumn(int j,int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = { {0,1,2,0},{3,4,5,2},{1,3,1,5} };
        printMatrix(mat);
        System.out.println();System.out.println();
        setZeroes(mat);
    }
}