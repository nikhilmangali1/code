class minBalance extends Exception{
    public String toString()
    {
        return "balance should be greater than 5000";
    }
}
class throwsException
{
    static void checkBalance(int bal) throws minBalance
    {
        if(bal<=500)
        {
            throw new minBalance();
        }
        else
        {
            System.out.println(bal);
        }
    }
    public static void main(String[] args) {
        try
        {
            checkBalance(10);
        }
        catch(minBalance mb)
        {
            System.out.println(mb);
        }
        finally
        {
            System.out.println("Program ends successfully!!!");
        }
    }
}