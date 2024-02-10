import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class Applet3 extends Applet implements ActionListener
{
Label L1,L2,L3;
TextField T1,T2,Result;
Button B1;
public void init()
{
L1=new Label("enterfirstnum");
add(L1);
T1=new TextField(10);
add(T1);
L2=new Label("entersecondnum");
add(L2);
T2=new TextField(10);
add(T2);
L3=new Label("result");
add(L3);
Result=new TextField(10);
add(Result);
B1=new Button("Divide");
add(B1);
B1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B1)
{
try
{
int value1=Integer.parseInt(T1.getText());
int value2=Integer.parseInt(T2.getText());
int result=value1/value2;
Result.setText(String.valueOf(result));
}
catch(NumberFormat Exceptionnfe)
{
JOptionPane.showMessageDialog(this,"notanumber");
}
catch(Arithmetic Exceptionae)
{
JOptionPane.showMessageDialog(this,"dividedbyzero");
}
}
}
}
/*<applet code="Applet3.class" width=500 height=500></applet>*/
