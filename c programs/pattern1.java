public class pattern1
{
    public static void main(String[] nnn)
    {
        jjj j=new jjj();
        j.printPat(3);
    }
}
class jjj{
    void printPat(int n) {
            int count = 0;
            for (int i = n; i >= 1; i--) {
                for (int j = i; j >= 1;) {
                    if (count == i) {
                        j--;
                    }
                    System.out.print(j + " ");
                    count++;
                }
                System.out.print("\n");
            }
    }
    }