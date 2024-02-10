/**
 * 
 * 
 * Time complexity ---> O(Q*n)  - Here Q is no.of elements to find its repititions
 *  and n is the no.of elements in the array
 */



public class No__Of__Ocuurances
{
    private static int findOcc(int[] a,int n)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,1,3,2,5,8,1,3};
        for(int i=0;i<arr.length;i++)
        {
            int rep=findOcc(arr, arr[i]);
            System.out.println(arr[i]+ " ---> "+rep);
        }
    }
}