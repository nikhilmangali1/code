public class Recursion9 {
    private static void sumOfN(int i,int sum){
        if(i<0) {
            System.out.println(sum);
            return;
        }
        sumOfN(i-1,sum+i);
    }
    public static void main(String[] args) {
        sumOfN(10,0);   
    }
}
