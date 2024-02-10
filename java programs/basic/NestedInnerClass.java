public class NestedInnerClass {
    public static void main(String[] args) {
        OuterClass o=new OuterClass(10);
        o.outerFun();
        OuterClass.InnerClass oi=new OuterClass().new InnerClass();
        oi.y=1000;
        oi.innerFun();
    }
}
class OuterClass
{
    int x;
    OuterClass()
    {

    }
    OuterClass(int num)
    {
        x=num;
    }
    class InnerClass
    {
        int y;
        void innerFun() {
            System.out.println("Outer value :"+x);
            System.out.println("Inner value " + y);
        }
    }
    void outerFun()
    {
        InnerClass ic=new InnerClass();
        ic.y=20;
        ic.innerFun();
        System.out.println("Outer class value :"+x);
    }
}