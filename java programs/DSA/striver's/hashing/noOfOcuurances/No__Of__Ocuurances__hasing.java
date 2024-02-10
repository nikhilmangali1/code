import java.util.Scanner;

public class No__Of__Ocuurances__hasing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter no.of elements in the array : ");
        int n=s.nextInt();
        System.out.println("ENter array elemets : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        //precompute

        int[] hash=new int[10000];
        for(int i=0;i<n;i++)
        {
            hash[a[i]]+=1;
        }

        int testCases;
        System.out.println("Enter no.of times you want to check : ");
        testCases=s.nextInt();
        while(testCases--!=0)
        {
            int number=s.nextInt();
            System.out.println(number+" appeared in array for ->>"+hash[number]);
        }
    }
}
