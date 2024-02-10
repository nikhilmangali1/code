import java.util.ArrayList;
public class Recursion18 {

    //private static boolean flag = false;
    private static void printSubSequencesWhoseSumIsK(int index,int[] arr,int k,int sum,ArrayList<Integer> list){
        if(index >= arr.length){
            if(sum == k /*&& flag == false*/){
                //flag = true;
                printList(list);
            }
            return;
        }
        list.add(arr[index]);
        printSubSequencesWhoseSumIsK(index+1,arr,k,sum+arr[index],new ArrayList<>(list));
        list.remove(list.size()-1);
        printSubSequencesWhoseSumIsK(index+1,arr,k,sum,new ArrayList<>(list));
    }

    private static void printList(ArrayList<Integer> list){
        System.out.println();
        for(int i:list){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void main(String[] nikhilmangali){
        int arr[] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        printSubSequencesWhoseSumIsK(0,arr,2,0,list);
    }
}
