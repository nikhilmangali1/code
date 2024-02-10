class MinOps {
    public static int minOperations(int[] nums, int x) {
        int start=0;
        int end=nums.length-1;
        int count=0;
        int sum=0;
        int summ=0;
        for(int i:nums)
        {
            summ+=i;
        }

        while(start<=end)
        {
            if(summ<x)
            {
                return -1;
            }
            if(sum==x)
            {
                return count;
            }
            else if(nums[start]<=x-sum&&nums[start]>nums[end])
            {
                sum+=nums[start];
                start++;
            }
            else if(nums[end]<=x-sum)
            {
                sum+=nums[end];
                end--;
            }
            else
            {
                return -1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={6016,5483,541,4325,8149,3515,7865,2209,9623,9763,4052,6540,2123,2074,765,7520,4941,5290,5868,6150,6006,6077,2856,7826,9119};
        int x=31841;
        int c=minOperations(a,x);
        System.out.println(c);
    }
} 