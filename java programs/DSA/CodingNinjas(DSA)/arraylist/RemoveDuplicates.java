import java.util.ArrayList;

public class RemoveDuplicates {
    private static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) al.add(arr[i]);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] a={10,10,20,20,20,30,30,40,50,10};
        ArrayList<Integer> list=removeConsecutiveDuplicates(a);
        for(int i:list){
            System.out.print(i+"\t");
        }
    }
}
