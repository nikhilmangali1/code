import java.util.Scanner;
public class armstrong1{
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           //Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int temp=n;
while(n!=0)
{
  int rem=n%10;
  result+=(rem*rem*rem);
  n=n/10;
}
if(result==temp)
{
  System.out.print(1);
}
else
{
  System.out.print(0);
}
sc.close();
    }
}