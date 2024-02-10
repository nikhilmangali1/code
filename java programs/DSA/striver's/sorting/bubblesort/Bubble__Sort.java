public class Bubble__Sort {
    private static void printArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    private static void bubbleSort(int[] a,int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        printArr(arr, n);
        bubbleSort(arr,n);
        printArr(arr, n);
    }
}
