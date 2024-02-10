public class Recursion3 {
    
    private static int count = 1;
    private static void fun() {
        if(count == 101 ) return;
        System.out.println(count);count++;
        fun();
        
    }
    public static void main(String[] args) {
        fun();
    }
}
