import javax.swing.*;
import java.awt.event.*;

public class Q1 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("CheckBox Toggle Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button
        JButton button = new JButton("Check");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Check me");

        // Set initial state for checkbox (unchecked)
        checkBox.setSelected(false);

        // Add action listener to the button


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle checkbox state and change button text accordingly
                if (checkBox.isSelected()) {
                    checkBox.setSelected(false);
                    button.setText("Check");
                } else {
                    checkBox.setSelected(true);
                    button.setText("UnCheck");
                }
            }
        });

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {

                    button.setText("UnCheck");
                } else {
                    button.setText("Check");
                }
            }
        });

        // Add components to the frame
        frame.setLayout(null); // Using null layout for simplicity

        // Set bounds for the button and checkbox
        checkBox.setBounds(100, 50, 100, 30);
        button.setBounds(100, 100, 100, 30);

        frame.add(checkBox);
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}
