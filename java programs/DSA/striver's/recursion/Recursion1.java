public class Recursion1 {
    private static void fun(){
        System.out.println(1);
        fun();                          //stack overflow
    }
    public static void main(String[] args) {
        fun();
    }
}