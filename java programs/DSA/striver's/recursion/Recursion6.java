public class Recursion6 {
    private static void printNto1(int N,int i){
        if(i<1) return ;
        System.out.println(N);
        printNto1(N-1,N);
    }
    public static void main(String[] args) {
        printNto1(100,100);
    }
}
