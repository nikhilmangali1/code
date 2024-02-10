public class Generic1<T>
{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
    public static void main(String[] args) {
        Generic1<Double> d=new Generic1<>();
        d.setData(10.0);
        System.out.println(d.getData());
    }
}
