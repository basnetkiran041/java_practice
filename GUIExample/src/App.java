//Example of Swing by Association inside constructor
import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame("First Application");
        JButton b=new JButton("Press");
        b.setBounds(130, 100, 100, 40);

        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        
    }
}
