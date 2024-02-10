@FunctionalInterface
interface LambdaDemo
{
    public void display(String str);
}
public class Lambda10 {
    public void reverseString(String str)
    {
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    System.out.println(sb);
    }
    public static void main(String[] args) {
        Lambda10 l9=new Lambda10();
        LambdaDemo ld=l9::reverseString;
        ld.display("Hello");
    }
    
}
