public class FloatClass {
    public static void main(String[] args) {
        float a=12.5f;
        Float b=-12.5f/0;
        System.out.println(b.equals(a));

        Float c=(float)Math.sqrt(-1);

        //instance methods 
        System.out.println(c.isNaN());
        System.out.println(Float.isNaN(c));

        System.out.println(b.isInfinite());
        System.out.println(b.isNaN());






        //static methods

        System.out.println(b==Float.POSITIVE_INFINITY);
        System.out.println(b==Float.NEGATIVE_INFINITY);
        System.out.println(Float.MAX_EXPONENT);
    }
}
