abstract class shape
{
    double PI=3.14;
    double r=12;
    shape()
    {
        System.out.println("Every solid figure has its own shape!!!");
    }
    abstract double caclArea();
    abstract double calcPeri();
}
class circle extends shape
{
    double caclArea()
    {
        return PI*r*r;
    }
    double calcPeri()
    {
        return 2*PI*r;
    }
}
class rectangle extends shape
{
    double l=12;
    double b=3;
    double caclArea()
    {
        return l*b;
    }
    double calcPeri()
    {
        return  2*(l+b);
    }
}
public class abstract2
{
    public static void main(String[] args)
    {
        shape s1=new circle();
        System.out.println("Area of circle : "+s1.caclArea());
        System.out.println("perimeter of circle : "+s1.calcPeri());
        shape s2=new rectangle();
        System.out.println("area of rectangle : "+s2.caclArea());
        System.out.println("perimeter of the rectangle : "+s2.calcPeri());
    }
}