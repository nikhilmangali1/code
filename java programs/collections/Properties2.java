import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class Properties2 {      // key and value are Strings by default
    public static void main(String[] args) throws IOException
    {
        Properties p=new Properties();
        
    //     p.setProperty("Brand", "Hp");
    //     p.setProperty("Processor", "i5");
    //     p.setProperty("OS", "Windows11");
    //     p.setProperty("Model", "pavillion15");

    //    // System.out.println(p);

    //    p.storeToXML(new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/collections/PropertiesCollection.xml"), "LaptopDetails");
        p.loadFromXML(new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/collections/PropertiesCollection.xml"));
        System.out.println(p);
        System.out.println(p.getProperty("Name"));
    }
}
