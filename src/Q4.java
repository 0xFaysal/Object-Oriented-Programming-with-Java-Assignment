import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        JButton button1 = new JButton("Click");
        JButton button2 = new JButton("Click");

        button1.setBackground(Color.RED);
        button2.setBackground(Color.BLUE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button1.getBackground() == Color.RED)
                    button1.setBackground(Color.GREEN);
                else
                    button1.setBackground(Color.RED);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button2.getBackground() == Color.BLUE)
                    button2.setBackground(Color.CYAN);
                else
                    button2.setBackground(Color.BLUE);
            }
        });

        button1.setBounds(100, 100, 100, 40);
        button2.setBounds(100, 150, 100, 40);

        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);





    }
}
