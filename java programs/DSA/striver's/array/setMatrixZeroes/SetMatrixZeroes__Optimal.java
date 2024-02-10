/**
 * 
 * Instead of taking two separate arrays ,
 * Let's take first row as Column__Array and
 * first column as Row__Array   inside the matrix to reduce the space complexity
 * 
 * 
 * Time complexity --> O(2*n*m)
 * Space Complexity --> 
 */

 

public class SetMatrixZeroes__Optimal {

    public static void setZeroes(int[][] matrix)
    {
        // int colsArr[]=new int[matrix[0].length]; --> matrx[0][0..]
        // int rowsArr[]=new int[matrix.length]; --> matrix[0...][0]
        int col0=1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    //Mark the i-th row
                    matrix[i][0]=0;
                    //Mark the j-th column 
                    if(j!=0)
                    {
                        matrix[0][j]=0;
                    }
                    else
                    {
                        col0=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=0)
                {
                    //check for column and row
                    if(matrix[0][j]==0||matrix[i][0]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
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
        int mat[][] = { {1,1,1,1},{1,1,0,1},{1,0,0,1},{0,1,1,1} };
        printMatrix(mat);
        System.out.println();System.out.println();
        setZeroes(mat);
        printMatrix(mat);
    }
}
