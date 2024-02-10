/**
 * 
 * Here, We need to print only one row i.e., nth row elements
 * And nth row has n no.of elements
 * We can do it by as First method we we find (r,c) th element ,Here also we can
 * do it by finding every elemnt by it's position that is bruteforce method .In this program
 * we will do it in a better way than previous one..
 * 
 * 
 * 
 * -->Let's say n=6
 * ->Here, First and last element of any row is definitely 1.
 * ->(6,0)==>1
 * ->(6,1)==>1*(n-1)            //here we start calculating form 1 position because, 0 th position is already 1 and upto n-1 because n th position also 1
 * ->(6,2)==>1*(n-1)*(n-2)
 * ->(6,3)==>1*(n-1)*(n-2)*(n-3)
 * ........
 * 
 * Here, Time Complecity --> O(n)
 *       Space complexity ---> O(1)
 */
public class Nth__RowElements {
    
    public static void main(String[] args) {
        findRowElements(6);
    }
    private static void findRowElements(int n)
    {
        int ans=1;
        System.out.print(ans);
        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print("\t"+ans);
        }
        System.out.println();
    }
}
