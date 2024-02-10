import java.awt.*;
import java.awt.event.*;
public class swap
{
    public static void main(String args[])
    {
        Frame f=new Frame("Swapping two values");
        Label l1=new Label("First Number");
        TextField t1=new TextField(10);
        Label l2=new Label("Second Number");
        TextField t2=new TextField(10);
        Button b=new Button("Click me two swap above two texts");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                String temp=t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
    }
}