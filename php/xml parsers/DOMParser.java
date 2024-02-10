import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;

public class DOMParser {
    public static void main(String[] args) {
        try {
            String choice;
            do {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder
                        .parse(new File("C:\\Users\\Nikhil\\Documents\\code\\php\\xml parsers\\students.xml"));
                document.getDocumentElement().normalize();

                // Element root = document.getDocumentElement();

                NodeList list = document.getElementsByTagName("student");
                System.out.println("Enter student ID : ");
                Scanner s = new Scanner(System.in);
                String id = s.next();

                for (int i = 0; i < list.getLength(); i++) {
                    Node node = list.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element ele = (Element) node;
                        if (ele.getAttribute("id").equals(id)) {
                            System.out.println("Name : " + ele.getElementsByTagName("name").item(0).getTextContent());
                            System.out.println("Age : " + ele.getElementsByTagName("age").item(0).getTextContent());
                        }
                    }
                }
                System.out.println("Do you want to search another record?[y/n] : ");
                choice = s.next();
                // s.close();
            } while ((choice.equals("y")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}