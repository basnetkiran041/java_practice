import javax.swing.*;
import java.awt.event.*;

public class SimpleMVCApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add / Subtract");

        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");

        l1.setBounds(30, 30, 120, 20);
        t1.setBounds(150, 30, 100, 20);

        l2.setBounds(30, 70, 120, 20);
        t2.setBounds(150, 70, 100, 20);

        addBtn.setBounds(30, 110, 100, 25);
        subBtn.setBounds(500, 110, 100, 25);

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(addBtn); frame.add(subBtn);

        frame.setSize(320, 200);
        frame.setLayout(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Action for Add
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int sum = a + b;
                JOptionPane.showMessageDialog(frame, "Sum is: " + sum);
            }
        });

        // Action for Subtract
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int diff = a - b;
                JOptionPane.showMessageDialog(frame, "Difference is: " + diff);
            }
        });
    }
}
