class MinBalance extends Exception {
    public String toString() {
        return "min balance should not be less than 500 rs";
    }
}

class myClass {
    public void message(int bal) {
        try {
            if (bal <= 500) {
                throw new MinBalance();
            } else {
                System.out.println("Balance is : " + bal);
            }
        } catch (MinBalance b) {
            System.out.println(b);
        }
        //System.out.println("hello");
        finally{
            System.out.println("Program ends here!!");
        }
    }
}

public class UserException1 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int balance = s.nextInt();
        new myClass().message(balance);
        s.close();
    }
}
