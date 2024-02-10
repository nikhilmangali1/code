import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.HashMap;

class Account implements Serializable
{
    //static int Code=0;
    String accNo;
    String name;
    double balance;
    Account()
    {

    }
    Account(String accNo,String name,double balance)
    {
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }
    public String toString()
    {
        return "Account No:"+accNo+"\nName:"+name+"\nBalance:"+balance+"\n";
    }
}
public class AccountChallange {
    public static void main(String[] args)throws Exception
    {
        HashMap<String,Account> h=new HashMap<>();
        Account acc=null;
        Scanner s=new Scanner(System.in);

        try
        {
            FileInputStream fis=new FileInputStream("Accounts.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int count=ois.readInt();
            for(int i=0;i<count;i++)
            {
                acc=(Account)ois.readObject();
                System.out.println(acc);
                h.put(acc.accNo,acc);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        System.out.println("Menu");

        int choice;
        String accno,name;
        double balance;

        do
        {
            System.out.println("1.Create account");
            System.out.println("2.Delete account");
            System.out.println("3.View account");
            System.out.println("4.View All account");
            System.out.println("5.Save account");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice::");
            choice=s.nextInt();
            s.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter Details AccountNo,Name,Balance:");
                    accno=s.nextLine();
                    name=s.nextLine();
                    balance=s.nextDouble();                  
                    acc=new Account(accno, name, balance);
                    h.put(accno,acc);
                    System.out.println("Account created for "+name);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Acc No:");
                    accno=s.nextLine();        
                    h.remove(accno);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Acc No:");
                    accno=s.nextLine();
                    acc=h.get(accno);
                    System.out.println(acc);
                    break;
                }
                case 4:
                {
                    for(Account a:h.values())
                    {
                        System.out.println(a);
                    }
                    break;
                }
                case 5:
                {

                }
                case 6:
                {
                    oos.writeInt(h.size());
                    for(Account a:h.values())
                    {
                        oos.writeObject(a); 
                    }
                    break;
                }
                default:
                {
                    break;
                }
            }
        }while(choice!=6);
 
        oos.flush();
        oos.close();
        fos.close();

        
    }
}
