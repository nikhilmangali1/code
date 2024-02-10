import java.awt.*;
import java.awt.event.*;


public class swap2
{
    public static void main(String[] args)
    {
        Frame f=new Frame("My Frame!!");
        Label l1=new Label("FIrst");
        Label l2=new Label("Second");
        Label l3=new Label("Resut:");

        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        TextField t3=new TextField(10);



        Button b=new Button("Click me!!");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                t3.setText(String.valueOf(sum));
            }
        });
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
    }
}