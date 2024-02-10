public class Recursion16 {
private static int fib(int n){
    if(n<=1) return n;
    int last = fib(n-1);
    int secondLast = fib(n-2);
    return last + secondLast;           // or return fib(n-1) + fib(n-2);
}

    public static void main(String[] nikhilmangali){
        int fibNo = fib(3);
        System.out.println(fibNo);
    }
}
