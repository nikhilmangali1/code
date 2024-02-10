public class Recursion2 {
    public static int count = 1;
    private static void fun(){
        System.out.println(count);
        count++;                        //a base case is required to stop the stack - overflow
        fun();                  
    }
    public static void main(String[] rga){
        fun();
    }
}
