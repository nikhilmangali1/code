public class IntegerClass {
    public static void main(String[] args) {
        int m1=15;
        Integer m2=m1;

        System.out.println(m2.equals(m1));

        System.out.println(Integer.valueOf("100", 2));
        System.out.println(Integer.valueOf("017", 8));
        System.out.println(Integer.valueOf("100", 10));
        System.out.println(Integer.valueOf("A8C", 16));
        System.out.println(Integer.valueOf("100",6));


        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.bitCount(122));
        System.out.println(Integer.compare(m1,m2));
        System.out.println(Integer.max(m1,m2));
        System.out.println(Integer.min(m1,m2));
        System.out.println(Integer.decode("0XA8C"));
        System.out.println(Integer.parseInt("273"));
        System.out.println(Integer.reverse(128));
        System.out.println(Integer.reverseBytes(128));
        System.out.println(Integer.rotateLeft(m1,1));
        System.out.println(Integer.rotateRight(m1, 1));
        System.out.println(Integer.toBinaryString(m1));
        System.out.println(Integer.signum(152));

        System.out.println(Integer.toHexString(100));
    }
}
