public class MaxSumOfSubarray {

    private static int findMaxSum(int[] arr,int sub){
        int maxSum = 0;
        for(int i=0;i<arr.length-2;i++){
            int sum = 0;
            for(int j=i;j<i+3;j++){
                sum += arr[j];
            }
            if(sum>=maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,2,9,7,1};
        int sub = 3;
        int maxSum = findMaxSum(arr,sub);
        System.out.println(maxSum);
    }
}
