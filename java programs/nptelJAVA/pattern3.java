import java.util.*;
public class pattern3 {
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	      int n = inr.nextInt();
     	if(n==0)
        {
          System.out.println(" _");
          System.out.println("| |");
          System.out.println("|_|");
        }
        else if(n==1)
        {
            System.out.println("|");
            System.out.println("|");
        }
        else if(n==2)
        {
            System.out.println("_");
            System.out.println("_|");
            System.out.println("|_");
        }
        else if(n==3)
        {
            System.out.println("_");
            System.out.println("_|");
            System.out.println("_|");
        }
        else if(n==4)
        {
            System.out.println("|_|");
            System.out.println("  |");
        }
        else if(n==5)
        {
            System.out.println("__");
            System.out.println("|_");
            System.out.println("_|");
        }
        else if(n==6)
        {
            System.out.println(" _");
            System.out.println("|_");
            System.out.println("|_|");
        }
        else if(n==7)
        {
            System.out.println("_");
            System.out.println(" |");
            System.out.println(" |");
        }
        else if(n==8)
        {
            System.out.println(" _");
            System.out.println("|_|");
            System.out.println("|_|");
        }
        else
        {
            System.out.println(" _");
            System.out.println("|_|");
            System.out.println("  |");
        }
        inr.close();
    }
}