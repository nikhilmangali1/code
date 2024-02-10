/**
 * Time Complexity is -->
 * -------------------------
 *  outer loop == n times
 *  inner loop == n-1 + n-2 + n-3 + n-4 + .........(sum n natural numbers-> (n*(n+1))/2)
 * 
 * i.e.,  (n^2/2)+ (n/2)    --> we neglect minimal term in time complexity
 *                 ------
 * 
 * 
 *   
 */

public class Selection__Sort1{
    private static void printArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    private static void selectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        printArr(arr,n);
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        printArr(arr, n);
        selectionSort(arr,n);
    }
}