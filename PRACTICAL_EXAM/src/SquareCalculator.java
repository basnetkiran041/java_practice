import javax.swing.*;
import java.awt.event.*;

public class SquareCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Calculator");

        JLabel labelInput = new JLabel("Enter any number:");
        labelInput.setBounds(30, 30, 150, 20);

        JTextField inputField = new JTextField();
        inputField.setBounds(160, 30, 100, 20);

        JButton button = new JButton("Get the Square");
        button.setBounds(100, 70, 140, 30);

        JLabel labelOutput = new JLabel("Square of entered number:");
        labelOutput.setBounds(30, 110, 180, 20);

        JTextField outputField = new JTextField();
        outputField.setBounds(200, 110, 100, 20);
        outputField.setEditable(false);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    int square = number * number;
                    outputField.setText(String.valueOf(square));
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid input");
                }
            }
        });

        frame.add(labelInput);
        frame.add(inputField);
        frame.add(button);
        frame.add(labelOutput);
        frame.add(outputField);

        frame.setSize(360, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
