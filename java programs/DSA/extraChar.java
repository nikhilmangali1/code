class findExtraCharacterClass
{
    char findExtraCharacter(String s1,String s2) throws StringIndexOutOfBoundsException
    {
        int count[]=new int[26];
        int n=s2.length();
        for(int i=0;i<n;i++)
        {
            count[s1.charAt(i)-'a']--;
            count[s2.charAt(i)-'a']++;
        }
        count[s2.charAt(n)-'a']++;
        for(int i=0;i<26;i++)
        {
            if(count[i]==1)
            {
                return (char)(i+'a');
            }
        }
        return 0;
    }
}
public class extraChar
{
    public static void main(String[] args)
    {
        String s1="nikhil";
        String s2="nikhila";
        findExtraCharacterClass fecc=new findExtraCharacterClass();
        char c=fecc.findExtraCharacter(s1, s2);
        System.out.println(c);
    }
}