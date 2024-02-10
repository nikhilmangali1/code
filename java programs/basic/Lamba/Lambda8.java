@FunctionalInterface
interface LambdaDemo
{
    public void display(String str);
}
public class Lambda8 {
    public static void main(String[] args) {
        LambdaDemo ld=System.out::println;
        ld.display("Hello");
    }
    
}
