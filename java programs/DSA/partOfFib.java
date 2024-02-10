public class partOfFib {
    public static void main(String[] args) {
        int n = 233;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int sum = a + b;
        while (sum <= n) {
            a = b;
            b = sum;
            sum = a + b;
            System.out.print(sum + " ");
             if(sum==n)
            {
                break;
            }
        }
        System.out.println();
        if (sum == n) {
            System.out.println("yes!It is part of the fibonacci series");
        } else {
            System.out.println("No!It is not part of the fibonacci series");
        }
    }
}
