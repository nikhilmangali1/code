import java.util.Scanner;

public class formatOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="";
        int x=0;
        System.out.println("==============================");
        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
            System.out.printf("%s%15d\n", s1, x);
        }
        System.out.println("================================");
    }
}
