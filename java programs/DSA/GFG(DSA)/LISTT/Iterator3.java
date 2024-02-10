import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator3
{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);

        ListIterator<Integer> it=li.listIterator(li.size());
        while(it.hasPrevious())
        {
            int x=(Integer)it.previous();
            it.set(x*10);
        }
        System.out.println(li);
    }    
}
