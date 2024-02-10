import javax.sql.rowset.spi.SyncFactory;

public class StaticBlock2 {
    public static void main(String[] args) {
        new SomeClass();
        System.out.println("Main block");
        new SomeClass();
        
    }
    
}
class SomeClass
{
    static
    {
        System.out.println("Static block 1");
    }
    static
    {
        System.out.println("Static block 2");
    }
    static 
    {
        System.out.println("Static block 3");
    }
}
