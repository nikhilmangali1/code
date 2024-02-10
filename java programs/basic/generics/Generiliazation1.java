public class Generiliazation1 {
    public static void main(String[] args) {
        Object obj=new String("Hello");
        //String str=obj;
        //obj=new Integer(10);
        String str=(String)obj;
        System.out.println(str);
    }
}
