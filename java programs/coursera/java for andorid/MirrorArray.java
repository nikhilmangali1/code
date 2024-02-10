public class MirrorArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4};
        int mir[]=mirrorA(ar);
        for(int i : mir)
        {
            System.out.print(i+"\t");
        }
    }
    private static int[] mirrorA(int[] ar)
    {
        int temp[]=new int[2*ar.length];
        for(int i=0;i<ar.length;i++)
        {
            temp[i]=ar[i];
            temp[temp.length-i-1]=ar[i];
        }
        return temp;
    }
}
