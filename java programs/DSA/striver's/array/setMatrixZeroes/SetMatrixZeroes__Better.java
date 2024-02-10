/**
 *  In this method , We create to arrays of sized : 
 *      ---> horizal array of size m(no.of columns)
 *      ---> verical array of size n(no.of rows)
 *              -To track where zero is present 
 *                  [No need to convert 0 to -1 and -1 to 0]
 *          --> If there is zero in a position , then entire row and column values will be zeroes . So, we need to mark the respective index of our arrays to 1 . 
 * 
 * 
 *      -->After completing arrays to marking up 1 ,Then itarate through matrix .If corresponding array value is 1 then entire row and column will be all zeroes..
 * 
 * 
 *      Time Complexity ==== O(2*n*m)
 *      Space Complexity ==== O(n)+O(m)
 */
public class SetMatrixZeroes__Better 
{
    public static void setZeroes(int[][] matrix)
    {
        int colsArr[]=new int[matrix[0].length];
        int rowsArr[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    colsArr[j]=1;
                    rowsArr[i]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(rowsArr[i]==1||colsArr[j]==1)
                {
                    matrix[i][j]=0;
                }
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
        printMatrix(mat);
    }
}
