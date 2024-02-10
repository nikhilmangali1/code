import java.applet.Applet;
import java.awt.Graphics;

public class Applet1 extends Applet {
    public void paint(Graphics g) {
        // Set the message text and position
        String message = "Hello, this is a simple Java applet!";
        int x = 50;
        int y = 50;

        // Display the message on the applet window
        g.drawString(message, x, y);
    }
}
/* 
 <applet code="Applet1.class" width="300" height="1000">
 </applet>
*/
