public class bits {
    public static void main(String[] args)
    {
        System.out.print(Solution.setBits(123));
    }
}
class Solution {
    static int setBits(int N) {
        // code here
        int count=0;
        String s=Integer.toBinaryString(N);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
