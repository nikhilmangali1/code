import java.io.*;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream to read the data file
            FileInputStream fis = new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\swingg\\Myfile.txt");
            Scanner sc = new Scanner(fis).useDelimiter("\t");

            // Create a Hashtable to store name-phone number pairs
            Hashtable<String, String> ht = new Hashtable<String, String>();

            String[] strArray;
            String a, str;

            // Read data from the file and populate the Hashtable
            while (sc.hasNext()) {
                a = sc.nextLine();
                strArray = a.split("\t");
                ht.put(strArray[0], strArray[1]);
                System.out.println("Hashtable values are: " + strArray[0] + ":" + strArray[1]);
            }

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the name as given in the phonebook");
            str = s.next();

            // Search for the entered name in the Hashtable
            if (ht.containsKey(str)) {
                System.out.println("Phone number is " + ht.get(str));
            } else {
                System.out.println("Name is not matched");
            }

            // Close the FileInputStream
            fis.close();
            sc.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
