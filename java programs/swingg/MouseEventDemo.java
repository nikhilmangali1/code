import java.awt.*;
import java.awt.event.*;

class MouseEventDemo extends Frame {
    private String eventName = "";

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 400);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eventName = "Mouse Clicked";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                eventName = "Mouse Pressed";
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                eventName = "Mouse Released";
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eventName = "Mouse Entered";
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eventName = "Mouse Exited";
                repaint();
            }
        });

        // addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent we) {
        //         System.exit(0);
        //     }
        // });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(eventName, getWidth() / 2 - 50, getHeight() / 2);
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
