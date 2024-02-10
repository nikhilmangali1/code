public class primeN {
    public static void main(String[] aStrings) {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int k = 2; k <= i; k++)
                if (i % k == 0) {
                    count += 1;
                }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}
