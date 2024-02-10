/**
 * 
 * Time Complexity --> O(r)  
 * 
 * Here, We need to pass the n-1 and r-1 inorder to get the element at the position in pascal triangle
 *        1
 *       1  1
 *      1  2  1
 *     1  3  3  1
 *    1  4  6  4  1     ===> Here, at position (5,3) ==>  __6__
 *   1  5  10 10 5  1       
 */


public class ElementAtPosition
{
    public static void main(String[] args) {
        int n=fun__nCr(5-1,3-1);
        System.out.println(n);
    }
    private static int fun__nCr(int n,int r)
    {
        int result=1;
        for(int i=0;i<r;i++)
        {
            result=result*(n-i);
            result=result/(1+i);
        }
        return result;
    }     
}
