import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class ToolboxGUI {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Toolbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        // Create a toolbar
        JToolBar toolbar = new JToolBar();
        // Create a button
        JButton hiButton = new JButton("Say Hi");
        // Add an action listener to the button
        hiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Hi!");
            }
        });
        // Add the button to the toolbar
        toolbar.add(hiButton);
        // Add the toolbar to the frame
        frame.getContentPane().add(toolbar, "North");
        // Make the frame visible
        frame.setVisible(true);
    }
}