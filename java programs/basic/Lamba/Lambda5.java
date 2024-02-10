@FunctionalInterface
interface LambdaInterface
{
    public int multiply(int x,int y);
}
public class Lambda5 {
    public static void main(String[] args) {
        LambdaInterface li=(a,b)->a*b;
        int k=li.multiply(100,2);
        System.out.println(k);
    }
}
