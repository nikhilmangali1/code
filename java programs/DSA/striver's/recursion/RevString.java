public class RevString {
    public static void main(String[] nikhilmangali){
        String s = "madam";
        String rev = "";
        int index = s.length()-1;
        while(index>=0){
            rev+=s.charAt(index);
            index--;
        }
        System.out.println(rev);
        if(s.equals(rev)) System.out.println("Yes");
        else System.out.println("No");
    }
}
