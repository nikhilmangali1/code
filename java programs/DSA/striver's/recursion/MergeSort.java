import java.util.ArrayList;
public class MergeSort {

    private static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }

    private static void merge(int[] arr,int low,int high,int mid){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }

    private static void printArray(int[] arr){
        System.out.println();
        for(int i:arr) System.out.print(i+"  ");
        System.out.println();
    }
    public static void main(String[] args) {
      int arr[] = {3,2,4,1};
      printArray(arr);
      mergeSort(arr,0,arr.length-1);
      printArray(arr);  
    }
}
