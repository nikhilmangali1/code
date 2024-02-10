/**
 * 
 * Time Complexity --> O(1)
 */

import java.util.HashMap;
import java.util.Scanner;

public class No__Of__Ocuurances__hasing__HashMap {
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

        
        
        // Precompute occurrences
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int freq = mpp.getOrDefault(key, 0); 
            mpp.put(key, freq + 1); 
        }


        int testCases;
        System.out.println("Enter no.of times you want to check : ");
        testCases=s.nextInt();
        while(testCases--!=0)
        {
            int number=s.nextInt();
            if(mpp.containsKey(number)){
                System.out.println(number+" appeared in array for ->>"+mpp.get(number));
            }
            else{
                System.out.println(0);
            }
        }
        s.close();
    }
}
