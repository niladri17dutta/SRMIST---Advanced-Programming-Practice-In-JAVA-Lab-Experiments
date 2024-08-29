import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Sum Calculator");
        // Specify FlowLayout for the layout manager
        frame.setLayout(null);
        // Set the initial size of the frame
        frame.setSize(300, 200);
        // Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create text fields for user input
        JTextField num1Field = new JTextField();
        num1Field.setBounds(50, 30, 200, 30);
        JTextField num2Field = new JTextField();
        num2Field.setBounds(50, 70, 200, 30);
        // Create a button to calculate the sum
        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(100, 110, 100, 30);
        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 150, 200, 30);
        // Add an action listener to the button
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from the text fields
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    // Calculate the sum
                    double sum = num1 + num2;
                    // Display the result
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });
        // Add components to the frame
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(sumButton);
        frame.add(resultLabel);
        // Display the frame
        frame.setVisible(true);
    }
}