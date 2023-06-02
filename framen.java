import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class framen extends JFrame{

    private Container c; 
    private JLabel lb; 
    private Font f;

    framen()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Times New Roman", Font.BOLD, 20);
        
        lb = new JLabel();
        lb.setText("This is another Frame");
        lb.setBounds(50,60,200,150);
        lb.setFont(f);
        lb.setForeground(Color.white);
        c.add(lb);

    }


        public static void main(String[] args) {
        framen frame = new framen();
        frame.setTitle("This is Frame 2");
        frame.setVisible(true);
        frame.setBounds(200,400,500,400);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
        }
}
