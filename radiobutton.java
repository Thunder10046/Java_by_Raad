import java.awt.Color;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radiobutton extends JFrame{

    private Container c; 
    private JRadioButton male, female;
    private Font f;  
    private ButtonGroup grp;

    radiobutton()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        f = new Font("Times New Roman", Font.BOLD, 18);

        grp = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(30,30,120,80);
        male.setFont(f);
        male.setBackground(Color.GRAY);
        male.setSelected(true);
        male.setForeground(Color.white);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(150,30,200,80);
        female.setFont(f);
        female.setBackground(Color.GRAY);
        female.setForeground(Color.white);
        c.add(female);

        grp.add(male);
        grp.add(female);

        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);    
            
        
    }

    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==male) {
                    JOptionPane.showMessageDialog(null, "You have pressed Male");              
            }
            else{
                JOptionPane.showMessageDialog(null, "You have pressed Female");
            }
            
        }

    }

    public static void main(String[] args) {
        radiobutton rb = new radiobutton();
        rb.setVisible(true);
        rb.setBounds(400,300,350,300);
        rb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
