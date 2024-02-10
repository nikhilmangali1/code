public class QuickSort {

    private static int findPartitionIndex(int arr[],int low,int high){
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int left = low;
        int right = high;
        while(left<right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[mid];
        arr[mid] = arr[right];
        arr[right] = temp;
        return right;   
    }

    private static void quickSort(int[] arr,int low,int high){
        if(low>=high) return;
        int partitionIndex = findPartitionIndex(arr,low,high);
        quickSort(arr,low,partitionIndex-1);
        quickSort(arr,partitionIndex+1,high);
    }

    private static void printArray(int[] arr){
        System.out.println();
        for(int i:arr) System.out.print(i+"  ");
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,1};
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
