public class Enumerations1 {
    public static void main(String[] args) {
        Dept d=Dept.IT;
        Dept b=Dept.CSE;
        System.out.println(b.getName()+ "  "+b.getLocation());
        System.out.println(d.getName()+ "  "+d.getLocation());
        // d.display();
        // b.display();
        // switch(d)
        // {
        //     case CIVIL:
        //     {
        //         System.out.println(d+" branch head is SaiKiran");
        //         break;
        //     }
        //     case MECH:
        //     {
        //         System.out.println(d+" branch head is SaiDeep");
        //         break;
        //     }
        //     case EEE:
        //     {
        //         System.out.println(d+" branch head is SaiKiran");
        //         break;
        //     }
        //     case ECE:
        //     {
        //         System.out.println(d+" branch head is Akshay");
        //         break;
        //     }
        //     case IT:
        //     {
        //         System.out.println(d+" branch head is Divya Bharathi");
        //         break;
        //     }
        //     case CSE:
        //     {
        //         System.out.println(d+" branch head is Nikhil");
        //         break;
        //     }
        //     default:
        //     {
        //         System.out.println("Please select one of the branches available!!");
        //     }
        // }
    }
}
enum Dept
{
    CSE("Nikhil","Siddipet"),
    IT("Divya Bharathi","Bhadrachalam"),
    ECE("Akshay","Siricilla"),
    EEE("SaiKiran","Yadadri"),
    MECH("SaiDeep","Hyd"),
    CIVIL("Abbavaram","Abbas");
    String head,loc;
    private Dept(String head,String loc)
    {
        this.head=head;
        this.loc=loc;
        
    }
    // public void display()
    // {
    //     System.out.println(this.name()+"   "+this.ordinal()+"   ");
    // }
    public String getName()
    {
        return head;
    }
    public String getLocation()
    {
        return loc;
    }
}