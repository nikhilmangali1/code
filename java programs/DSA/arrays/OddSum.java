public class OddSum {

    private static int sumOdds(int[] arr){
        int sum = 0;
        for(int i:arr){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result = sumOdds(arr);
        System.out.println("Sum : "+result);
    }
    
}
