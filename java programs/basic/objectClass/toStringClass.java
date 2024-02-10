public class toStringClass
{
    String name;
    int rollno;
    toStringClass(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public String  toString()
    {
        return "your name is "+name+" and your roll no is "+rollno;
    }
    public static void main(String[] args)
    {
        toStringClass tsc1=new toStringClass("nikhil",1);
        toStringClass tsc2=new toStringClass("laxmi",2);
        toStringClass tsc3=new toStringClass("laxmi",2);
        toStringClass tsc4=tsc1;
        System.out.println(tsc1);
        System.out.println(tsc2);
        System.out.println(tsc3);
        System.out.println(tsc4.toString());
    }
}