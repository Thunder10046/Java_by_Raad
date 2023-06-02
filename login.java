import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField username;
    private JLabel lb1, lb2;
    private JButton bt1, bt2;
    private JPasswordField pass;
    private Font f;
    private Container c;

    login() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        f = new Font("Times New Roman", Font.BOLD, 18);

        lb1 = new JLabel();
        lb1.setBounds(50, 25, 150, 80);
        lb1.setText("Enter Username: ");
        lb1.setFont(f);
        lb1.setForeground(Color.white);
        c.add(lb1);

        username = new JTextField();
        username.setBounds(190, 40, 200, 50);
        username.setFont(f);
        c.add(username);

        lb2 = new JLabel();
        lb2.setBounds(50, 120, 150, 80);
        lb2.setText("Enter Password: ");
        lb2.setFont(f);
        lb2.setForeground(Color.white);
        c.add(lb2);

        pass = new JPasswordField();
        pass.setBounds(190, 136, 200, 50);
        pass.setEchoChar('*');
        pass.setFont(f);
        c.add(pass);

        bt1 = new JButton("Log In");
        bt1.setBounds(190, 230, 100, 50);
        bt1.setBackground(Color.LIGHT_GRAY);
        c.add(bt1);

        bt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = username.getText();
                String p = pass.getText();
                if (s.equals("Raad") && p.equals("2003042")) {
                    JOptionPane.showMessageDialog(null, "Welcome to Alternative of NESCO_BD " + s);
                    dispose();
                    billing bill = new billing();
                    bill.setVisible(true);
                    bill.setBounds(150, 70, 500, 700);
                    bill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Input! ");
                }
            }

        });

        bt2 = new JButton("Clear");
        bt2.setBounds(290, 230, 100, 50);
        bt2.setBackground(Color.LIGHT_GRAY);
        c.add(bt2);

        bt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                username.setText("");
                pass.setText("");

            }

        });

    }

    public static void main(String[] args) {
        login frame = new login();
        frame.setVisible(true);
        frame.setBounds(200, 300, 480, 350);
        frame.setTitle("Interface by 2003042");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
