import java.util.*;

public class quickSort1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String[] strings = new String[n];
        for(int i=0;i<strings.length;i++)
        {
            strings[i]=s.nextLine();
        }
        quickSort(strings, 0, strings.length - 1);
        System.out.println(Arrays.toString(strings));
        s.close();
    }

    static void quickSort(String[] strings, int low, int high) {
        if (low < high) {
            int start = low;
            int end = high;
            int mid = (start + end) / 2;
            String pivot = strings[mid];
            while (start <= end) {
                while (strings[start].compareTo(pivot) < 0) {
                    start++;
                }
                while (strings[end].compareTo(pivot) > 0) {
                    end--;
                }
                if (start <= end) {
                    String temp = strings[start];
                    strings[start] = strings[end];
                    strings[end] = temp;
                    start++;
                    end--;
                }
            }
            quickSort(strings, low, end);
            quickSort(strings, start, high);
        }
    }
}
