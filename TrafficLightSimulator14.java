import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;

    public TrafficLightSimulator() {
        // Frame setup
        setTitle("Traffic Light Simulator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Radio buttons for selecting lights
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group radio buttons to allow only one selection at a time
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Panel for radio buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        add(buttonPanel, BorderLayout.WEST);

        // Panel to display the lights
        lightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw gray circles for lights when they are off
                g.setColor(Color.GRAY);
                g.fillOval(100, 50, 80, 80);   // Red light position
                g.fillOval(100, 150, 80, 80);  // Yellow light position
                g.fillOval(100, 250, 80, 80);  // Green light position

                // Change color based on selected radio button
                if (redButton.isSelected()) {
                    g.setColor(Color.RED);
                    g.fillOval(100, 50, 80, 80);
                } else if (yellowButton.isSelected()) {
                    g.setColor(Color.YELLOW);
                    g.fillOval(100, 150, 80, 80);
                } else if (greenButton.isSelected()) {
                    g.setColor(Color.GREEN);
                    g.fillOval(100, 250, 80, 80);
                }
            }
        };
        add(lightPanel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lightPanel.repaint(); // Repaint the light panel to show the selected light
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrafficLightSimulator frame = new TrafficLightSimulator();
            frame.setVisible(true);
        });
    }
}
