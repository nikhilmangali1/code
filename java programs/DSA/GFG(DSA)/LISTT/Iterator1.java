import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator1
{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(1,200);
        System.out.println(li.size());
        li.set(1,100);
        ListIterator<Integer> it=li.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }    
}
