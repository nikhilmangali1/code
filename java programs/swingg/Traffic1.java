import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Traffic1 extends JFrame implements ItemListener {
    JLabel l1, l2;
    JPanel nPanel, cPanel;
    ButtonGroup bg;

    public Traffic1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(2, 1));
        
        nPanel = new JPanel(new FlowLayout());
        cPanel = new JPanel(new FlowLayout());
        
        l1 = new JLabel();
        Font f = new Font("TimesNewRoman", Font.ITALIC, 72);
        l1.setFont(f);
        nPanel.add(l1);
        add(nPanel);
        
        l2 = new JLabel("Select Lights");
        cPanel.add(l2);
        
        bg = new ButtonGroup();

        JRadioButton r1 = new JRadioButton("Red Light", true); // Create JRadioButtons
        r1.setBackground(Color.RED);
        bg.add(r1); // Add r1 to the ButtonGroup
        cPanel.add(r1);
        r1.addItemListener(this); // Register an item listener
        
        
        JRadioButton r2 = new JRadioButton("Yellow Light", true); // Create JRadioButtons
        r2.setBackground(Color.YELLOW);
        bg.add(r2); // Add r2 to the ButtonGroup
        cPanel.add(r2);
        r2.addItemListener(this); // Register an item listener
        
        JRadioButton r3 = new JRadioButton("Green Light", true); // Create JRadioButtons
        r3.setBackground(Color.GREEN);
        bg.add(r3); // Add r3 to the ButtonGroup
        cPanel.add(r3);
        r3.addItemListener(this); // Register an item listener
        
        add(cPanel);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent i) {
        JRadioButton selectedRadioButton = (JRadioButton) i.getItem(); // Get the selected radio button
        String str = selectedRadioButton.getText();
        char choice = str.charAt(0);
        
        switch (choice) {
            case 'R':
                l1.setText("STOP");
                l1.setForeground(Color.RED);
                break;
            case 'Y':
                l1.setText("Ready");
                l1.setForeground(Color.YELLOW);
                break;
            case 'G':
                l1.setText("GO");
                l1.setForeground(Color.GREEN);
                break;
        }
    }

    public static void main(String[] args) {
        Traffic1 a = new Traffic1();
    }
}
