public class Recursion4 {
    // private static int count=1;
    private static void printMyNameNTimes(int i,int N){
        if(i > N) return;
        System.out.println("Nikhil Mangali");
        printMyNameNTimes(i+1,N);
    }
    public static void main(String []nikhil){
        printMyNameNTimes(1,10);
    }
}
