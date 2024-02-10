class some
{
    int i;
    some(int i)
    {
        this.i=i--;
    }
}
class somemore extends some
{
    somemore(int i)
    {
        super(++i);
        System.out.println(i);
    }
}
public class Exce {
    public static void main(String[] args) {
        new somemore(20);
    }
}
