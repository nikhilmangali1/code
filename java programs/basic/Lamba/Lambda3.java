@FunctionalInterface
interface LambdaInterface
{
    void display(String str);
}

public class Lambda3 {
    public static void main(String[] args) {
        LambdaInterface li=(s)->
        {                                               
            System.out.println("Something is  "+s);
        };
        li.display("Miracle");
    }
}
