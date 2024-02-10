import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int l = inr.nextInt();
        // Add the necessary code in the below space
      if(l%2==0)
      {
        System.out.print("Invalid line number");
      }
      else
      {
      for(int i=1;i<=l;i++)
      {
        int by=(l+1)/2;
        int totalCols=i>by?l-i+1:i;
        for(int j=1;j<=by-totalCols;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=totalCols;k++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
      }
    }
}