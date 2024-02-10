@FunctionalInterface
interface LambdaInterface
{
    void display();
}
// class MyClass implements LambdaInterface
// {
//     public void display()
//     {
//         System.out.println("Something");
//     }
// }
public class Lambda1 {
    public static void main(String[] args) {
        LambdaInterface li=new LambdaInterface()        //Anonymous Inner-Class
        {
            public void display()
            {
                System.out.println("Something");
            }
        };
        li.display();
    }
}
