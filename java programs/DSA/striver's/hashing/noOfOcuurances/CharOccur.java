/**
 * 
 * This takes lot of time i.e., O(Q*n)
 */

import java.util.Scanner;

public class CharOccur {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        s.close();
        for(int i=0;i<str.length();i++)
        {
            int n=findOccur(str,str.charAt(i));
            System.out.println(str.charAt(i)+" is occured in string for "+n+" times");
        }
    }
    private static int findOccur(String s,char c)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        return count;
    }
}
