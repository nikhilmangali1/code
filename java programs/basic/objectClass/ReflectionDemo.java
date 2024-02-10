import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) {

        Class c=My.class;
        //or
        My m=new My();
        Class d=m.getClass();


        System.out.println(c.getName());

        Field field[]=c.getDeclaredFields();
        for(Field f:field)
        {
            System.out.println(f);
        }

        Constructor con[]=c.getConstructors();
        for(Constructor cn:con)
        {
            System.out.println(cn);
        }

        // Method mmm[]=c.getMethods();
        // for(Method mm:mmm)
        // {
        //     System.out.println(mm);
        // }
    }
}
class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    public My()
    {

    }
    public My(String s,int k)
    {

    }
    void someThing(int j)
    {

    }
    int getSomething()
    {
        return 0;
    }
}