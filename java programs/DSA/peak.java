class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
       for(int i=1;i<n-1;i++)
       {
           if(arr[i]>arr[i-1]||arr[i]>arr[i+1])
           {
               return 1;
           }
       }
       return 0;
    }
}
class peak
{
    public static void main(String[] args)
    {
        int a[]={1,2,3};
        int n=a.length;
        System.out.println(Solution.peakElement(a, n));
    }
}