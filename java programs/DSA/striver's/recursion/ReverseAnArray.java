public class ReverseAnArray {
    private static void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
        revArr(arr);
        printArr(arr);   
    }
}
