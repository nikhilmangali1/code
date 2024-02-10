@FunctionalInterface
interface LambdaInterface
{
    void display();
}

public class Lambda2 {
    public static void main(String[] args) {
        LambdaInterface li=()->
        {                                               //Anonymous method
            System.out.println("Something");
        };
        li.display();
    }
}
