import java.io.FileInputStream;
public class CheckedException1 {
    static void fun1()
    {
        FileInputStream fi=new FileInputStream("MyTest.txt");
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    static void fun4()
    {
        fun3();
    }
    public static void main(String[] args) {
        fun4();
    }
}
