public class Recursion14 {

    private static boolean checkPallindromeString(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return checkPallindromeString(s,l+1,r-1);
    }

    public static void main(String[] nikhilmangali){
        boolean check = checkPallindromeString("madam",0,"madam".length()-1);
        System.out.println(check);
    }
}
