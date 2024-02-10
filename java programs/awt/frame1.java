import java.awt.*;
import java.awt.event.*;

public class frame1 extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b;

    frame1() {
        super("Frame");
        l1 = new Label("First");
        l2 = new Label("Second");
        l3=new Label("Addition");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3=new TextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        b = new Button("Click Me!");
        add(b);
        b.addActionListener(this);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int sum=n1+n2;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        frame1 f = new frame1();
        f.setVisible(true);
        f.setSize(400, 400);
    }
}