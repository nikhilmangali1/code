import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>(20);
        ar.add(10);
        ar.add(20);
        ar.add(0,5);
        
        ArrayList<Integer> ar1=new ArrayList<>(List.of(70,50,60,70,80,90));
        ar.addAll(0,ar1);

        System.out.println(ar.contains(100));

        System.out.println(ar.get(0));

        System.out.println(ar.indexOf(10));

        System.out.println(ar.lastIndexOf(70));

        ar.set(0,100);

        System.out.println(ar);

        //iterating through ArrayList

        //for-loop
        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+"\t");
        }
        System.out.println();

        //for-each loop
        for(Integer i:ar)
        {
            System.out.print(i+"\t");
        }
        System.out.println();

        //using var variable
        for(var i:ar)
        {
            System.out.print(i+"\t");
        }
        System.out.println();

        //iterator method

        for(Iterator<Integer> it=ar.iterator();it.hasNext();)
        {
            java.lang.Integer x=it.next();
            System.out.print(x+"\t");
        }
        System.out.println();

        //use functional operator
        ar.forEach((x) ->
        {
            System.out.print(x+"\t");
        });
        System.out.println();

        //Iterator - unidirection
        Iterator<Integer> ii=ar.iterator();
        while(ii.hasNext())
        {
            System.out.print(ii.next()+"\t");
        }
        System.out.println();

        //ListIterator - bidirection
        ListIterator<Integer> li=ar.listIterator();
        while(li.hasNext())
        {
            System.out.print(li.next()+"\t");
        }
        System.out.println();

        //lambda expression
        ar.forEach(n->System.out.print(n+"\t"));
        System.out.println();

        //
        ar.forEach(System.out::println);
        System.out.println();

        //
        ar.forEach(n->display(n));
        System.out.println();
    }
    public static void display(int n)
    {
        if(n>-1)
        {
            System.out.print(n+"\t");
        }
    }
}
