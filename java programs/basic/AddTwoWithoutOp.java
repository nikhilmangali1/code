public class AddTwoWithoutOp
{
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int small=a>b?b:a;
        int sum=0;
        for(int i=small;i<=200;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}