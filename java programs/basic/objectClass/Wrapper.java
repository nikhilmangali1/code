public class Wrapper {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(10);
        int b=20;
        Integer c=Integer.valueOf(b);
        int d=a.intValue();
        int e=b;
        System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e);

        float f=100.34F;
        Float g=Float.valueOf(f);       //Boxing    or Wrapping
        float h=g.floatValue();
        float i=g;                      //Unboxing  or unwrapping
        System.out.println(f+"  "+g+"  "+h+"  "+i);

        int x=1001;
        Integer y=x;                     //Auto-Boxing

        Integer m=Integer.values("987");
        int n=m;                         //Auto-unboxing
    }
}
