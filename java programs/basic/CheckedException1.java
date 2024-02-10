import java.io.FileInputStream;
import java.io.IOException;
public class CheckedException1 {
    static int fun1(int a,int b) throws Exception
    {
        if(a<0||b<0)
        {
            throw new Exception("a and b values should be greater than 0!!!");
        }
        return a*b;
    }
    static void fun2()
    {
        try
        {
            int r=fun1(10,11);
            System.out.println(r);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
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
