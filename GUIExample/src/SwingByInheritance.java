import javax.swing.*;
public class SwingByInheritance extends JFrame{
    SwingByInheritance()
    {
        
        JButton b=new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        add(b);
        setTitle("First Application");
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingByInheritance();
    }
    
    
}
