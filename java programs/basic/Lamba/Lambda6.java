@FunctionalInterface
interface LambdaInterface
{
    public void display();
}
class Demo
{
    int temp=10;                        //class variables-can be modified 
    public void method1()
    {
        int count=1;                    //should be final or effectively final-should not be modifies afterwards
        LambdaInterface li=()->
        {
            int there=1;
            System.out.println("Hello"+(++temp)+"   "+(there+3));           //local variable can be modified
            System.out.println("World"+count);              //count++ results in error
        };
        li.display();
    }
}
public class Lambda6 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.method1();
    }
}
