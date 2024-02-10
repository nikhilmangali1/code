public class EvenInArray {

    private static void findEvenInArray(int[] arr){
        for(int i:arr){
            if(i%2 == 0){
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        findEvenInArray(arr);
    }
}
