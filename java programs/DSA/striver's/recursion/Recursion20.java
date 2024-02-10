public class Recursion20 {
    private static int findOneSubSequence(int index,int[] arr,int k,int sum){

        if(sum>=k) return 0;

        if(index >= arr.length){
            if(sum == k)
                return 1;
            else
                return 0;
        }
        int l = findOneSubSequence(index+1,arr,k,sum+arr[index]);
        int r = findOneSubSequence(index+1, arr, k, sum);

        return l+r;

    }

    public static void main(String[] nikhilmangali){
        int arr[] = {1,2,1,1,3,5};
        int b = findOneSubSequence(0,arr,8,0);
        if(b>0) System.out.println(b);
    }
}
