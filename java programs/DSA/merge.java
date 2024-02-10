class Solution {
    // Function to merge the arrays
    public static void merge(long a1[], long a2[], int n, int m) {
        int o = m + n;
        long[] a3 = new long[o];
        long temp = 0;
        
        for (int i = 0; i < n; i++) {
            a3[i] = a1[i];
        }
        
        for (int i = 0; i < m; i++) {
            a3[n + i] = a2[i];
        }
        
        for (int i = 0; i < o - 1; i++) {
            for (int j = 0; j < o - i - 1; j++) {
                if (a3[j] > a3[j + 1]) {
                    temp = a3[j];
                    a3[j] = a3[j + 1];
                    a3[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < o; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}
class merge
{
    public static void main(String[] args)
    {
        long a1[]={1, 3 ,5,7};
        long a2[]={0 ,2 ,6 ,8 ,9};
        Solution.merge(a1,a2, a1.length , a2.length);
    }
}