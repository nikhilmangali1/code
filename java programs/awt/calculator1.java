import java.awt.*;
import java.awt.event.*;

public class calculator1 {
    private Frame frame;
    private TextField textField1, textField2, textField3;

    public calculator1() {
        frame = new Frame("Simple calculator1");
        frame.setSize(375, 400); // Adjust the size to fit the calculator1

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5, 4, 10, 10)); // Use a 5x4 grid layout

        Label l1 = new Label("FIRST NUMBER");
        textField1 = new TextField(8);

        Label l2 = new Label("SECOND NUMBER");
        textField2 = new TextField(8);

        Label l3 = new Label("RESULT:");
        textField3 = new TextField(8);
        textField3.setEditable(false);

        panel.add(l1);
        panel.add(textField1);
        panel.add(l2);
        panel.add(textField2);
        panel.add(l3);
        panel.add(textField3);

        // Create buttons for numbers and arithmetic symbols
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            panel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onButtonClick(label);
                }
            });
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void onButtonClick(String label) {
        if (label.equals("C")) {
            // Clear the text fields
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        } else if (label.equals("=")) {
            // Perform the calculation when "=" is pressed
            try {
                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                int result = calculateResult(n1, n2, textField3.getText());
                textField3.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textField3.setText("Invalid input");
            } catch (ArithmeticException e) {
                textField3.setText("Division by zero");
            }
        } else {
            // Append the button label to the appropriate text field
            if (textField1.isFocusOwner()) {
                textField1.setText(textField1.getText() + label);
            } else if (textField2.isFocusOwner()) {
                textField2.setText(textField2.getText() + label);
            }
        }
    }

    private int calculateResult(int n1, int n2, String operator) {
        switch (operator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return n1 / n2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        new calculator1();
    }
}
