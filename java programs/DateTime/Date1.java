import java.time.*;
public class Date1
{
    public static void main(String[] args) {
        /*-----Time from 1970-------*/
        System.out.println("MilliSeconds from 1900:"+System.currentTimeMillis());
        System.out.println("Seconds:"+System.currentTimeMillis()/1000);
        System.out.println("Minutes:"+System.currentTimeMillis()/1000/60);
        System.out.println("Hours:"+System.currentTimeMillis()/1000/60/60);
        System.out.println("Days:"+System.currentTimeMillis()/1000/60/60/24);
        System.out.println("Years:"+System.currentTimeMillis()/1000/60/60/24/365);


        System.out.println("Maximum values for Long type :"+Long.MAX_VALUE);
    }
}