import java.awt.*;
import java.awt.event.*;
class calculator
{
    public static void main(String[] args)
    {
        Frame f=new Frame("MY CALCULATOR");

        f.setSize(375, 250);

        Label l1=new Label("FIRST NUMBER");
        l1.setBounds(25,30,100,30);
        f.add(l1);

        Label l2=new Label("SECOND NUMBER");
        l2.setBounds(25, 60, 100, 30);
        f.add(l2);

        Label l3=new Label("RESULT:");
        l3.setBounds(25,90,100,30);
        f.add(l3);


        TextField t1=new TextField(8);
        t1.setBounds(150,30,100,30);
        f.add(t1);

        TextField t2=new TextField(8);
        t2.setBounds(150,60,100,30);
        f.add(t2);

        TextField t3=new TextField(8);
        t3.setBounds(150,90,100,30);
        f.add(t3);


        Button b1=new Button("ADD");
        b1.setBounds(25, 130, 70, 30);
        f.add(b1);

        Button b2=new Button("SUBTRACT");
        b2.setBounds(100,130,70,30);
        f.add(b2);

        Button b3=new Button("MULTIPLY");
        b3.setBounds(175, 130, 70, 30);
        f.add(b3);

        Button b4=new Button("DIVIDE");
        b4.setBounds(250,130,70,30);
        f.add(b4);

        b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
             int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=n1+n2;
            t3.setText(String.valueOf(res));
           }

        });

         b2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
             int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=n1-n2;
            t3.setText(String.valueOf(res));
           }

        });

         b3.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
             int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=n1*n2;
            t3.setText(String.valueOf(res));
           }

        });

         b4.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
             int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=n1/n2;
            t3.setText(String.valueOf(res));
           }

        });

        Button clearTextFieldsButton=new Button("RESET");
        clearTextFieldsButton.setBounds(350,130,70,30);
        f.add(clearTextFieldsButton);

        clearTextFieldsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });


        f.setLayout(null);
        f.setVisible(true);
    }
}