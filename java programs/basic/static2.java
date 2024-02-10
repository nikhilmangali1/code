class x

{
    static 
    {y.disp();
    }
}
class y extends x
{
    static void disp()
    {
        System.out.println("java");
    }
}
public class static2 {
    public static void main(String[] args) {
        y.disp();
    }
}
