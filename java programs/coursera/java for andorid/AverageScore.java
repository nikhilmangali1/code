import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        String marks=s.nextLine();
        computeAverage(marks);
        s.close();
    }
    private static void computeAverage(String input)
    {
        String m[]=input.split(" ");
        int marks[]=new int[m.length];
        double sum=0.0;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=Integer.parseInt(m[i]);
            sum+=marks[i];
        }
        double avg=sum/marks.length;
        System.out.println("Average marks are "+avg);
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<avg)
            {
                System.out.println(marks[i]+" is below than average "+avg);
            }
        }
    }
    
}
