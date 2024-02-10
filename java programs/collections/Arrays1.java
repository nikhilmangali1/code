import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator
{
    public int compare(Integer a,Integer b)
    {
        if(a<b)
        {
            return 1;
        }
        if(a>b)
        {
            return -1;
        }
        return 0;
    }
}

public class Arrays1 {
    public static void main(String[] args) {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,3,1,3,5,7};

        System.out.println(Arrays.compare(a,b)); // returns if both are equal

        int c[]=Arrays.copyOf(a, 4);
        for(int x:c)
        {
            System.out.print(x+"\t");
        }
        System.out.println();

        Arrays.fill(c,10);
        for(int x:c)
        {
            System.out.print(x+"\t");
        }
        System.out.println();

        System.out.println(Arrays.mismatch(a, b));

        Arrays.sort(a);

        for(int x:a)
        {
            System.out.print(x+"\t");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(a, 3));


        /*-------------------------- */
 
        Integer aa[]={2,4,6,8,1,3,5,7};

        Arrays.sort(aa,new MyComparator());

        for(int x:aa)
        {
            System.out.println(x);
        }



    }
}
