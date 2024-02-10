import java.util.ArrayList;
public class Recursion19 {
    private static boolean findOneSubSequence(int index,int[] arr,int k,int sum,ArrayList<Integer> list){
        if(index >= arr.length){
            if(sum == k){
                printList(list);
                return true;
            }
            else{
                return false;
            }
        }
        list.add(arr[index]);
        if((findOneSubSequence(index+1,arr,k,sum+arr[index],new ArrayList<>(list)))) return true;
        list.remove(list.size()-1);
        return (findOneSubSequence(index+1, arr, k, sum,new ArrayList<>(list)));

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
        boolean b = findOneSubSequence(0,arr,2,0,list);
        if(!b) System.out.println("No subsequences");
    }
}
