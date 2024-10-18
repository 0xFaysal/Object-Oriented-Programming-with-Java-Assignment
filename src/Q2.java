import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JLabel label1 = new JLabel("Enter celsius value:");
        JTextField CIn = new JTextField();
        JLabel l1 = new JLabel("C");
        JButton button = new JButton("Convert to Fahrenheit");
        JLabel label2 = new JLabel("Fahrenheit value:");
        JTextField FOut = new JTextField();
        JLabel l2 = new JLabel("F");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(CIn.getText());
                double f = c * 9/5 + 32;
                FOut.setText(String.valueOf(f));
            }
        } );

        frame.setLayout(null);

        label1.setBounds(50,50,150,30);
        CIn.setBounds(200,50,50,30);
        l1.setBounds(260,50,50,30);
        button.setBounds(50,100,200,30);
        label2.setBounds(50,150,150,30);
        FOut.setBounds(200,150,50,30);
        l2.setBounds(260,150,50,30);

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
