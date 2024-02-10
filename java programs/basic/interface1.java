interface Hey
{
    void add(int e);
    int get();
}
public class interface1 implements Hey
{
    public void add(int i)
    {

    }
    public int get()
    {
        return 10;
    }
    public static void main(String[] args) {
        Hey h=new interface1();
        h.add(10);
        System.out.println(h.get());
    }    
}
