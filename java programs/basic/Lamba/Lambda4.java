@FunctionalInterface
interface LambdaInterface
{
    public int multiply(int x,int y);
}
public class Lambda4 {
    public static void main(String[] args) {
        LambdaInterface li=(a,b)->{return a*b;};
        System.out.println(li.multiply(100, 2));
    }
}
