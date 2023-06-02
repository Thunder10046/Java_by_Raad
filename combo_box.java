import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo_box extends JFrame{
    private Container c; 
    private String [] proglang = {"C", "C++", "Java", "Python"}; 
    
    combo_box()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        Font f = new Font("Times New Roman", Font.BOLD, 15);

        JComboBox cb = new JComboBox<>(proglang); 
        cb.setBounds(30,80,100,30);
        cb.setBackground(Color.LIGHT_GRAY);
        cb.setFont(f);
        c.add(cb);

        JLabel lb1 = new JLabel();
        lb1.setFont(f);
        lb1.setBounds(30,35,500,30);
        lb1.setText("Choose Your Programming Language: ");
        lb1.setForeground(Color.white);
        c.add(lb1);

        JTextArea txtara = new JTextArea();
        txtara.setBackground(Color.lightGray);
        txtara.setFont(f);
        txtara.setForeground(Color.BLACK);
        txtara.setBounds(30,130,400,50);
        c.add(txtara);

        JButton bt = new JButton();
        bt.setFont(f);
        bt.setBackground(Color.lightGray);
        bt.setText("Select");
        bt.setBounds(290,230,100,50);
        c.add(bt);

        bt.addActionListener(new ActionListener(){

           public void actionPerformed(ActionEvent e)
           {
            String s = cb.getSelectedItem().toString();
            txtara.append("You have selected language"+s+". ");
            txtara.setWrapStyleWord(true);
            txtara.setLineWrap(true);
            
           } 
        });

        
    }

    public static void main(String[] args) {
        combo_box bx = new combo_box();
        bx.setVisible(true);
        bx.setBounds(200,300,480,350);
    bx.setTitle("Interface by 2003042");
    bx.setResizable(true);
    bx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


