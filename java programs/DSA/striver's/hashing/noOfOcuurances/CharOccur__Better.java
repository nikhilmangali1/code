import java.util.Scanner;

public class CharOccur__Better {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        // str.toLowerCase();
        int[] hash=new int[256];
        for(int i=0;i<str.length();i++)
        {
            hash[str.charAt(i)]++;
            
        }
        int testCase=s.nextInt();
        while(testCase--!=0){
            char c=s.next().charAt(0);
            System.out.println(c+" has ocuured in string for --> "+hash[c]);
        }
        s.close();
    }
}