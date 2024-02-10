public class LargestOddString {
    public static String largestOddNumber(String num) {
        String largest="";
        int len=num.length();
        long n=Long.parseLong(num);
        int i=1;
        while(n%2==0&&i<len)
        {
            n/=10;
            i+=1;
        }
        if(n%2!=0)
        {
            return Long.toString(n);
        }
        return "";
    }
    public static void main(String[] args) {
        String num=largestOddNumber("20026888882");
        System.out.println(num);
    }

}
