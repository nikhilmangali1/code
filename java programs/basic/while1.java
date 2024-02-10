
public class while1 {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("Enter a numner : ");
        int n=s.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        }
        System.out.println("Loop Ended!!");
    }
}
