import java.util.Scanner;

public class gcd {
    public static void main(String[] mihhk) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        s.close();
        if (n1 == 0) {
            System.out.println(n2);
        } else if (n2 == 0) {
            System.out.println(n1);
        } else {
            int divident, divisor, quotient, remainder;
            if (n1 > n2) {
                divident = n1;
                divisor = n2;
            } else {
                divident = n2;
                divisor = n1;
            }
            while (true) {
                quotient = divident / divisor;
                remainder = divident % divisor;
                if (remainder == 0) {
                    System.out.println(divisor);
                    break;
                }
                divident = divisor;
                divisor = remainder;
            }
        }
    }
}
