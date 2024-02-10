import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
      for(int rows=1;rows<=n;rows++)
      {
        int spaces=n-rows;
        for(int i=1;i<=spaces;i++)
        {
          System.out.print("  ");
        }
        for(int cols=1;cols<=2*rows-1;cols++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
      System.out.print(n*n);
      inr.close();
    }
}