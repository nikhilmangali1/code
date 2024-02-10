public class Recursion12 {

    private static void revArr(int []arr,int left,int right){
        if(left>=right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        revArr(arr, left+1, right-1);
    }
    
    private static void printArr(int arr[]){
        System.out.println();
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        printArr(arr);
        revArr(arr,0,arr.length-1);
        printArr(arr);
    }
}
