@interface MyAnno
{
    String name();
    String project();
    String date();
    float version();
}
@MyAnno(name="nikhil")
class myclass
{
    @MyAnno(name="Nikhil")
    int a;
    public static void main(@MyAnno(name="Nikhil") String[] args) {
        @MyAnno(name="Nikhil")
        int xl;
    }
}