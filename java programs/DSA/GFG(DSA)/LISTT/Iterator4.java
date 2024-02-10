import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator4
{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);

        ListIterator<Integer> it=li.listIterator();
        while(it.hasNext())
        {
            it.add(5);
            it.next();
            it.add(100);
        }
        System.out.println(li);
    }    
}
