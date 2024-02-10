public class Generiliazation3<T>
{
   // T data[]=new T[3];        //error 
    T data[]=(T[])new Object[3];
    public static void main(String[] args) throws Exception
    {
        Generiliazation3<String> s=new Generiliazation3();
        s.data[0]="hi";
        s.data[1]="bye";
        s.data[2]="10";

        String str=s.data[0];
        System.out.println(str);
    }
}
//error- we should use ArrayList instead of arrays