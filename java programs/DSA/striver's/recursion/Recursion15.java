public class Recursion15 {

    private static boolean checkPallindromeString(String s,int l){
        if(l>=(s.length()/2)) return true;
        if(s.charAt(l) != s.charAt(s.length()-l-1)) return false;
        return checkPallindromeString(s,l+1);
    }

    public static void main(String[] nikhilmangali){
        boolean check = checkPallindromeString("madam",0);
        System.out.println(check);
    }
}
