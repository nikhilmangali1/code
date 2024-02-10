class one

{
    static int x;
    static
    {
            x++;
    }
    static
    {
        ++x;
    }
}
class two extends one
{
    static
    {
        --x;

    }
    static
    {
        x--;
    }
}
public class sup {
    public static void main(String[] args) {
        System.out.println(new two().x);
    }
}
