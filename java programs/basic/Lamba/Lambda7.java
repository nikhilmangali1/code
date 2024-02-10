@FunctionalInterface
interface LambdaDemo
{
    public void display();
}
class Uselambda
{
    public void callLambda(LambdaDemo ld)
    {
        ld.display();
    }
}
class Demo
{
    public void method1()
    {
        Uselambda ul=new Uselambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}
public class Lambda7 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
}
