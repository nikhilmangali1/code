import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class TextToTable extends JFrame {
    public TextToTable() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 800);
        GridLayout layout = new GridLayout(6, 4);
        setLayout(layout);

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\swingg\\Table.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            Scanner sc = new Scanner(isr);
            String[] arrayList;
            String str;
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                arrayList = str.split(",");
                for (String i : arrayList) {
                    add(new JLabel(i));
                }
            }
            sc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TextToTable();
        });
    }
}
