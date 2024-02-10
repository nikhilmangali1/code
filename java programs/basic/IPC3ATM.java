public class IPC3ATM {
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer1 c1=new Customer1(a,"Nikhil",1000);
        Customer2 c2=new Customer2(a,"Srikanth",2000);
        c1.start();
        c2.start();
    }
}
class ATM
{
    synchronized void checkBalanace(String s)
    {
        System.out.print(s+" is....CHECKING!!! ");
        try{Thread.sleep(1000);}catch(InterruptedException ie){}
        System.out.println("BALANCE");
    }
    synchronized void withdraw(String s,int a)
    {
        System.out.print ("Customer named "+s+" just debited ");
        try{Thread.sleep(1000);}catch(InterruptedException ie){}
        System.out.println(a);
    }
}
class Customer1 extends Thread
{
    ATM atm;
    String name;
    int amount;
    Customer1(ATM atm,String c1Name,int c1Amount)
    {
        this.atm=atm;
        name=c1Name;
        amount=c1Amount;
    }
    void useATM()
    {
        atm.checkBalanace(name);
        atm.withdraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}
class Customer2 extends Thread
{
    ATM atm;
    String name;
    int amount;
    Customer2(ATM atm,String c2Name,int c2Amount)
    {
        this.atm=atm;
        name=c2Name;
        amount=c2Amount;
    }
    void useATM()
    {
        atm.checkBalanace(name);
        atm.withdraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}