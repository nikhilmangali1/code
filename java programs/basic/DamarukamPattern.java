public class DamarukamPattern {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
                for (int j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
            System.out.println();
        }
        for(int j=n-1;j>=1;j--)
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print(" ");
            }
            for(int i=j;i<=n;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
