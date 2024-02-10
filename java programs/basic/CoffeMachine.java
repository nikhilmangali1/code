class CoffeMachine1 
{
    private int coffee;
    private int water;
    static private CoffeMachine1 our=null;
    static private int limit;
    private CoffeMachine1()
    { 
        limit=5;
        coffee=1;
        water=1;
    }
    static CoffeMachine1 getInstance()
    {
        if(our==null)
        {
           // if(limit>=0)
            {
                our=new CoffeMachine1();
            }
        }
        return our;
    }
}
public class CoffeMachine
{
    public static void main(String[] args)
    {
        CoffeeMachine1 c1=CoffeMachine1.getInstance();
        CoffeeMachine1 c2=CoffeMachine1.getInstance();
        CoffeeMachine1 c3=CoffeMachine1.getInstance();
        CoffeeMachine1 c4=CoffeMachine1.getInstance();
        CoffeeMachine1 c5=CoffeMachine1.getInstance();
       // CoffeeMachine1 c6=CoffeMachine1.getInstance();
        System.out.println(c1+"  "+c2+"  "+c3+" "+c4+" "+c5+" ");
        if(c1==c2)
        {
            System.out.println("same");
        }
    }
}