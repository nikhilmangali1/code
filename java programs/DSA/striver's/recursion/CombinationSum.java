import java.util.ArrayList;
public class CombinationSum {

    private static void printList(ArrayList<ArrayList<Integer>> list){
        System.out.println();
        for(ArrayList<Integer> al:list){
            for(int i:al){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static ArrayList<ArrayList<Integer>> combinationSum(int[] arr,int target){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        findCombinations(0, arr, target, res, new ArrayList<>()); 
        return res;
    }

    private static void findCombinations(int i,int[] arr,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list){
        if(i==arr.length){
            if(target == 0){
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        if(i<=target){
            list.add(arr[i]);
            findCombinations(i, arr, target-arr[i],res,list);
            list.remove(list.size()-1);
        }
        findCombinations(i+1, arr, target, res,list);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int sum = 7;
        printList(combinationSum(arr,sum));
    }
}
