import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PersonalDetailsGUI {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Personal Details Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        // Create and add labels and text fields for personal details
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        frame.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 30);
        frame.add(nameField);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 80, 100, 30);
        frame.add(ageLabel);
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 80, 200, 30);
        frame.add(ageField);
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 130, 100, 30);
        frame.add(addressLabel);
        JTextField addressField = new JTextField();
        addressField.setBounds(150, 130, 200, 30);
        frame.add(addressField);
        // Create and add the "Print" button
        JButton printButton = new JButton("Print");
        printButton.setBounds(150, 180, 100, 30);
        frame.add(printButton);
        // Add action listener to the "Print" button
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the input details
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();
                // Display the details in a pop-up dialog
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age + "\nAddress: " + address,
                        "Personal Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Make the frame visible
        frame.setVisible(true);
    }
}