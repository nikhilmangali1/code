import java.util.Scanner;

public class prime {
    public static void main(String[] nikhil) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(n + "is a prime number");
            } else {
                System.out.println(n + "is not a prime number");
            }
    }
}
