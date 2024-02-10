public class Recursion13 {
    private static void revArr(int arr[],int i){
        if(i>=(arr.length/2)) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        revArr(arr,i+1);
    }

    private static void printArr(int arr[]){
        System.out.println();
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] nikhilmangali){
        int[] arr = {1,2,3,4,2};
        printArr(arr);
        revArr(arr,0);
        printArr(arr);
    }
}
