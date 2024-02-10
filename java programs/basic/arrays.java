public class arrays {
    public static void main(String[] args) {
        int a[]={1,0,1};
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[(a[i]+3)%a.length];
        }
         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
