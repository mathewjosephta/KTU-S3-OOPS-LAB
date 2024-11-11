import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0;
    private char operator;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Buttons for digits and operations
        String[] buttons = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", "C", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        try {
            switch (input) {
                case "C":
                    display.setText("");
                    num1 = num2 = 0;
                    operator = '\0';
                    break;
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    display.setText(calculate(num1, num2, operator));
                    break;
                case "+": case "-": case "*": case "/":
                    num1 = Double.parseDouble(display.getText());
                    operator = input.charAt(0);
                    display.setText("");
                    break;
                default:
                    display.setText(display.getText() + input);
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private String calculate(double n1, double n2, char op) {
        double result = 0;
        switch (op) {
            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': 
                if (n2 == 0) return "Cannot divide by zero";
                result = n1 / n2; 
                break;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}

