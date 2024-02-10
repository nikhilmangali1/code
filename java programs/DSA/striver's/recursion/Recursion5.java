public class Recursion5 {

    // private static int i = 1;
    private static void print1ToN(int i,int N){
        if(i > 100) return;
        System.out.println(i);
        print1ToN(i+1, N);
    }
    public static void main(String[] args) {
        print1ToN(1,100);
    }
}
