public class nCr {
    public static void main(String args[]) {
        int n = 6;
        int r = 2;
        int factN = 1;
        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }
        int factR = 1;
        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }
        int factNR = 1;
        for (int i = 1; i <= n - r; i++) {
            factNR = factNR * i;
        }
        System.out.println(factN);
        System.out.println(factR);
        System.out.print(factNR);
        double den = (double) factR * (double) factNR;
        double num = (double) factN;
        double res = num / den;
        System.out.println(res);
    }
}
