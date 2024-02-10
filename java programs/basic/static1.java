class Test 
{
    static int x=100;
    int y=200;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x+" ");
    }
}
public class static1 {
    public static void main(String[] args) {
     Test t1=new Test();
     Test t2=new Test();
     t1.show();
     t2.display();   
     Test.display();
     t1.x=5000;
     t1.y=6000;
     t1.show();
     t2.display();   
     Test.display();
    }
}
