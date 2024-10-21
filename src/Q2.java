import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260,200);
        JLabel label1 = new JLabel("Enter celsius value:");
        JTextField CIn = new JTextField(10);
        JLabel l1 = new JLabel("C");
        JButton button = new JButton("Convert to Fahrenheit");
        JLabel label2 = new JLabel("Fahrenheit value:");
        JTextField FOut = new JTextField(10);
        JLabel l2 = new JLabel("F");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(CIn.getText());
                double f = c * 9/5 + 32;
                FOut.setText(String.valueOf(f));
            }
        } );

        frame.setLayout(new FlowLayout(1, 4, 10));


        frame.add(label1);
        frame.add(CIn);
        frame.add(l1);
        frame.add(button);
        frame.add(label2);
        frame.add(FOut);
        frame.add(l2);




        frame.setVisible(true);
    }
}
