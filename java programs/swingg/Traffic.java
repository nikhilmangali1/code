import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class TrafficSimulator extends JFrame implements ItemListener {
    JLabel l1, l2, l3, l4, l5;
    JPanel nPanel, cPanel;
    CheckboxGroup cbg;

    public TrafficSimulator() {
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
        cbg = new CheckboxGroup();
        Checkbox r1 = new Checkbox("Red Light", cbg, true);
        r1.setBackground(Color.RED);
        cPanel.add(r1);
        r1.addItemListener(this);
        Checkbox r2 = new Checkbox("Yellow Light", cbg, true);
        r2.setBackground(Color.YELLOW);
        cPanel.add(r2);
        r2.addItemListener(this);
        Checkbox r3 = new Checkbox("Green Light", cbg, true);
        r3.setBackground(Color.GREEN);
        cPanel.add(r3);
        r3.addItemListener(this);
        add(cPanel);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent i) {
        Checkbox chk = cbg.getSelectedCheckbox();
        String str = chk.getLabel();
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
        TrafficSimulator a = new TrafficSimulator();
    }
}
