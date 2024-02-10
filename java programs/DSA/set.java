import java.util.Scanner;

public class set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] s = new int[m];
            
            for (int i = 0; i < m; i++) {
                s[i] = in.nextInt();
            }
            
            int k = 1;
            
            for (int i = 0; i <= n; i++) {
                k = k * (i + 1);
                
                for (int j = 0; j < s.length; j++) {
                    if (s[j] == i) {
                        System.out.println(s[j]);
                        break;
                    }
                }
            }
        }
        in.close();
    }
}
