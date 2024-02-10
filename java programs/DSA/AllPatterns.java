public class AllPatterns {
    public static void main(String[] args) {
        System.out.println("Patter 1");
        pattern1(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 2");
        pattern2(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 3");
        pattern3(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 4");
        pattern4(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 6");
        pattern5(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 7");
        pattern6(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 8");
        pattern7(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 9");
        pattern8(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 10");
        pattern9(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 11");
        pattern10(5);
        System.out.println();
        System.out.println();
        System.out.println("Patter 12");
        pattern11(5);
        System.out.println();
        System.out.println();
    }
    public static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int totalColsInRow = row>n?(2*n)-row:row;
            for(int col=1;col<=totalColsInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int totalColsInRow = row>n?(2*n)-row:row;
            int noofspaces=n-totalColsInRow;
            for(int k=1;k<=noofspaces;k++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=totalColsInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int totalColsInRow = row>n?(2*n)-row:row;
            int noofspaces=n-totalColsInRow;
            for(int k=1;k<=noofspaces;k++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=totalColsInRow;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int k=0;k<n-row;k++)
            {
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n)
    {
        for(int row=1;row<n*2;row++)
        {
            int totalColsInRow=row>n?(2*n)-row:row;
            int totalSpaces=n-totalColsInRow;
            for(int k=1;k<=totalSpaces;k++)
            {
                System.out.print("  ");
            }
            for(int cols=totalColsInRow;cols>=1;cols--)
            {
                System.out.print(cols+" ");
            }
            for(int cols=2;cols<=totalColsInRow;cols++)
            {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n)
    {
        for(int rows=1;rows<2*n;rows++)
        {
           for(int cols=1;cols<2*n;cols++)
           {
            int atEVeryIndex=0;
            System.out.print(atEVeryIndex);
           }
            System.out.println();
        }
    }
}
