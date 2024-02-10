public class Enumerations {
    public static void main(String[] args) {
        Dept d=Dept.CSE;
        System.out.println(d.ordinal());
        System.out.println(d.name());
        System.out.println(Dept.valueOf("CSE"));

        Dept list[]=Dept.values();
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i]);
        }

        for(Dept k:list)
        {
            System.out.println(k);
        }
    }
}
enum Dept
{
    CSE,
    IT,
    ECE,
    EEE,
    MECH,
    CIVIL
}