import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int ar[]={827,37,38,29,93,92};
        Arrays.sort(ar);
        double med=0.0;
        int midIndex=0;
        if(ar.length%2==0)
        {
            midIndex=ar.length/2;
            med=(ar[midIndex]+ar[midIndex-1])/2.0;
        }
        else
        {
            midIndex=ar.length/2;
            med=ar[midIndex];
        }
        System.out.println(med);
    }
}
