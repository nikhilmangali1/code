public class InsertInArray1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=i+1;
        }
        for(int i:a)
        {
            System.out.println(i);
        }
        //inserting at index 2
        int i=2;
        while(i<=a.length-1)
        {
            a[i+1]=a[i];
            i+=1;
        }
        for(int k:a)
        {
            System.out.println(k);
        }
    }
}
