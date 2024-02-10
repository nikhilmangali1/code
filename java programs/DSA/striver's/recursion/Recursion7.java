public class Recursion7 {

    private static void fun(int i, int n) {
        if (i <= 0)
            return;
        fun(i - 1, n); // *Backtracking*
        System.out.println(i);
    }

    public static void main(String[] atgs) {
        fun(100, 100);
    }
}
