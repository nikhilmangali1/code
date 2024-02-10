import java.util.Scanner;
public class anagram {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int CHAR=256;
        String s1=s.nextLine();
        String s2=s.nextLine();
        StringBuilder sb1=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder(s2);
        int count[]=new int[CHAR];
        if(sb1.length()!=sb2.length())
        {
            System.out.println("no anagram!!");
            return;
        }
        for(int i=0;i<sb1.length();i++)
        {
            count[sb1.charAt(i)]++;
            count[sb2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("no anagram!");
                break;
            }
        }
        System.out.println("anagram is present!");
        s.close();
    }
}
