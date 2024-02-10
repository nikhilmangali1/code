@FunctionalInterface
interface LambdaDemo
{
    public void display(String str);
}
public class Lambda9 {
    public static void reverseString(String str)
    {
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    System.out.println(sb);
    }
    public static void main(String[] args) {
        LambdaDemo ld=Lambda9::reverseString;
        ld.display("Hello");
    }
    
}
