import java.util.*;

public class Recursion17 {

    private static int list[] = { 3, 1, 2 };

    private static void findSubSequences(int index, List<Integer> arr) {
        if (index >= list.length) {
            printList(arr);
            return;
        }
        arr.add(list[index]);
        findSubSequences(index + 1, arr);
        arr.remove(arr.size() - 1);
        findSubSequences(index + 1, arr);
    }

    private static void printList(List<Integer> arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] nikhilmangali) {
        List<Integer> arr = new ArrayList<>();
        findSubSequences(0, arr);
    }
}
