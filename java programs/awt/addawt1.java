import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b;

    MyFrame()
    {
        super("Frame");
        l1=new Label("First");
        l2=new Label("Second");
        l3=new Label("Addition");

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(l3);
        add(t3);

        b=new Button("Click Me!");
        add(b);
        setLayout(new FlowLayout());

    }
public void setButtonListener(myListener l)
{
    b.addActionListener(l);
}
}
class myListener implements ActionListener
    {
        MyFrame f;
        myListener(MyFrame f)
        {
            this.f=f;
        }
         public void actionPerformed(ActionEvent ae)
    {
        int n1=Integer.parseInt(f.t1.getText());
        int n2=Integer.parseInt(f.t2.getText());
        int sum=n1+n2;
        f.t3.setText(String.valueOf(sum));
    }
    }
class addawt1
{
    public static void main(String[] args) throws Exception
    {
        MyFrame mf=new MyFrame();
        myListener l=new myListener(mf);
        mf.setButtonListener(l);
        mf.setVisible(true);
        mf.setSize(400,400);
    }
}