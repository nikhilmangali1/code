public class Recursion11 {

    private static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] nikhilmangali){
        System.out.println(fact(5));
    }
}
