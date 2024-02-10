import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seri {
    public static void main(String[] args) throws Exception
    {
        Customer list[]={new Customer("nikhil","9704894216"),new Customer("divya","6453839383")};
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);        oos.writeInt(list.length);
        for(Customer c: list)
        {
            oos.writeObject(c);
        }
        oos.close();
        fos.close();
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int lengthl=ois.readInt();
        Customer cc[]=new Customer[lengthl];
        for(int i=0;i<lengthl;i++)
        {
            cc[i]=(Customer)ois.readObject();
        }

        for(Customer c:cc)
        {
            System.out.println(c);
        }
         
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("\nENter name of the customer : ");
        String name=s.nextLine();
        for(int i=0;i<lengthl;i++)
        {
            if(name.equalsIgnoreCase(cc[i].name))
            {
                System.out.println(cc[i]);
            }
        }
        ois.close();
        fis.close();
    }
}
class Customer implements Serializable
{
    String custId;
    String name;
    String phoneNo;

    static int count = 1;
    Customer()
    {

    }
    Customer(String n,String phone)
    {
        custId="C"+count;
        count++;
        name=n;
        phoneNo=phone;
    }
    public String toString()
    {
        return "Customer ID :"+custId+"\n"+"Customer Nmae :"+name+"\n"+"Customer PhoneNo: "+phoneNo+"\n";
    }
}