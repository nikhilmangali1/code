class a
{
    public void disp()
    {
        System.out.println("java");
    }
}
class b extends a{
    public void disp()
    {
        System.out.println("nptel");
    }
}
class C extends b{
    public void disp()
    {
        super.super.disp();
        System.out.println("course");
    }
}
public class overriden {
    public static void main(String[] args) {
        C c=new C();
        c.disp();
    }
}
