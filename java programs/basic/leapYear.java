import java.util.Scanner;
public class leapYear {
   public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    int year=s.nextInt();
    s.close();
    System.out.println(year%4==0?"it is leap year ":"it is not a leap year");
   } 
}
