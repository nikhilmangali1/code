import java.util.Scanner;

class seriesLOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                int result = a;
                for (int k = 0; k <= j; k++) {
                    result += Math.pow(2, k) * b;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
