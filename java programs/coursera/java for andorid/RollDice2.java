import java.util.*;

public class RollDice2 {
    public static void main(String[] args) {
        final int NUMROLLS=100;
        int count[]=new int[13];
        Random r=new Random();

        for(int i=0;i<NUMROLLS;i++)
        {
            int die1=r.nextInt(6)+1;
            int die2=r.nextInt(6)+1;
            count[die1+die2]++;
        }

        for(int i=2;i<count.length;i++)
        {
            System.out.println(i+" rolled for "+count[i]+ " times and "+ 100.0*count[i]/NUMROLLS+" % percentage  ");
        }
    }
}
