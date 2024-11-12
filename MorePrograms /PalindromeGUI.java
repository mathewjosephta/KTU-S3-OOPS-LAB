import javax.swing.*;
import java.awt.event.*;

class PalindromeChecker implements ActionListener {
    JFrame f;
    JTextField t;
    JButton checkButton, clearButton;
    JLabel resultLabel;

    PalindromeChecker() {
        // Frame setup
        f = new JFrame("Palindrome Checker");
        
        // Text field for user input
        t = new JTextField();
        t.setBounds(50, 40, 200, 30);

        // Check button to initiate palindrome check
        checkButton = new JButton("Check Palindrome");
        checkButton.setBounds(50, 80, 200, 40);
        
        // Clear button to reset input and result
        clearButton = new JButton("Clear");
        clearButton.setBounds(50, 130, 200, 40);
        
        // Label to display result
        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 180, 300, 40);

        // Adding components to the frame
        f.add(t);
        f.add(checkButton);
        f.add(clearButton);
        f.add(resultLabel);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        // Adding action listeners for buttons
        checkButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            // Get the input text, convert to lowercase, and remove spaces
            String input = t.getText().toLowerCase().replaceAll("\\s+", "");
            String reversed = new StringBuilder(input).reverse().toString();
            
            // Check if input is a palindrome and update result label
            if (input.equals(reversed)) {
                resultLabel.setText("It's a palindrome!");
            } else {
                resultLabel.setText("Not a palindrome.");
            }
        } else if (e.getSource() == clearButton) {
            // Clear input and result when 'Clear' button is clicked
            t.setText("");
            resultLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new PalindromeChecker();
    }
}
