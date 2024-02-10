public class Generiliazation2 {
    public static void main(String[] args) {
        Object obj[]=new Object[3]; //we can store any type of object in this array
        obj[0]="hi";
        obj[1]="bye";
        obj[2]=10;      //run-time error
        String str;
        for(int i=0;i<3;i++)
        {
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}
