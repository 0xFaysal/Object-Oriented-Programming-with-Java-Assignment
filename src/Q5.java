import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class GUITest {
     public static void main(String[] args) {
         JFrame f = new JFrame("Oceans App");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300, 150);
            f.setLayout(new FlowLayout());

            String [] oceans = {"Pacific", "Atlantic", "Indian", "Arctic", "Antarctic"};

            JTextField tf1 = new JTextField(20);
            JTextField tf2 = new JTextField(20);

            //add code here
            JButton b = new JButton("Show");
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index = Integer.parseInt(tf1.getText());
                    tf2.setText(oceans[index]);
                }
            });


            f.add(tf1);
            f.add(tf2);
            f.add(b);

            //---------------------//
            f.setVisible(true);
     }
}
