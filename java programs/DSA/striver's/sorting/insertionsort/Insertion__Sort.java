public class Insertion__Sort {
    private static void printArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    private static void insertionSort(int[] a,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while (j>0 && a[j-1] > a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        printArr(arr, n);
        insertionSort(arr,n);
        printArr(arr, n);
    }
}
