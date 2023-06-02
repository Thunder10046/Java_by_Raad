import java.awt.Color;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class billing extends JFrame {

    private Container c;
    private JLabel name, accname, bot, powerdby, cb, due, imaglabel;
    private JTextField nm, acc, bt, du;
    private JTextArea txtara;
    private Font f;
    private JButton clear, submit;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private ButtonGroup grp;
    private ImageIcon img;
    private String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };

    billing() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        img = new ImageIcon(getClass().getResource("bill.png"));
        this.setIconImage(img.getImage());

        // imaglabel = new JLabel(img);
        // imaglabel.setBounds("100,"26,img.getIconWidth(),)


        f = new Font("Ariel", Font.BOLD, 18);

        name = new JLabel();
        name.setFont(f);
        name.setBounds(50, 26, 150, 80);
        name.setText("Name: ");
        name.setForeground(Color.white);
        c.add(name);

        nm = new JTextField();
        nm.setFont(f);
        nm.setForeground(Color.BLACK);
        nm.setBounds(180, 52, 200, 32);
        c.add(nm);

        accname = new JLabel();
        accname.setFont(f);
        accname.setBounds(50, 70, 150, 80);
        accname.setText("Account No: ");
        accname.setForeground(Color.white);
        c.add(accname);

        acc = new JTextField();
        acc.setFont(f);
        acc.setForeground(Color.BLACK);
        acc.setBounds(180, 95, 200, 32);
        c.add(acc);

        bot = new JLabel();
        bot.setFont(f);
        bot.setBounds(50, 112, 150, 80);
        bot.setText("B.O.T/UNIT: ");
        bot.setForeground(Color.white);
        c.add(bot);

        JTextField rec_BOT = new JTextField();
        rec_BOT.setFont(f);
        rec_BOT.setForeground(Color.BLACK);
        rec_BOT.setBounds(180, 140, 200, 32);
        c.add(rec_BOT);

        due = new JLabel();
        due.setFont(f);
        due.setBounds(50, 150, 150, 80);
        due.setText("BILL Due: ");
        due.setForeground(Color.white);
        c.add(due);

        grp = new ButtonGroup();

        rb1 = new JRadioButton("Yes");
        rb1.setBounds(180, 180, 100, 20);
        rb1.setFont(f);
        rb1.setBackground(Color.GRAY);
        rb1.setForeground(Color.white);
        c.add(rb1);

        rb2 = new JRadioButton("NO");
        rb2.setBounds(300, 180, 100, 20);
        rb2.setFont(f);
        rb2.setBackground(Color.GRAY);
        rb2.setSelected(true);
        rb2.setForeground(Color.white);
        c.add(rb2);

        JLabel duee = new JLabel();
        duee.setFont(f);
        duee.setBounds(50, 200, 150, 80);
        duee.setText("Enter Due: ");
        duee.setForeground(Color.white);
        c.add(duee);

        du = new JTextField();
        du.setFont(f);
        du.setForeground(Color.BLACK);
        du.setBounds(180, 225, 200, 32);
        c.add(du);

        grp.add(rb1);
        grp.add(rb2);

        Handler handler = new Handler();
        rb1.addActionListener(handler);
        rb2.addActionListener(handler);

        JLabel lb1 = new JLabel();
        lb1.setFont(f);
        lb1.setBounds(50, 250, 150, 80);
        lb1.setText("Chose Month: ");
        lb1.setForeground(Color.white);
        c.add(lb1);

        JComboBox cb = new JComboBox<>(month);
        cb.setBounds(180, 275, 200, 30);
        cb.setBackground(Color.lightGray);
        cb.setForeground(Color.white);
        cb.setSelectedIndex(11);
        cb.setFont(f);
        c.add(cb);

        clear = new JButton("Clear");
        clear.setBounds(180, 320, 100, 40);
        clear.setBackground(Color.lightGray);
        clear.setFont(f);
        clear.setForeground(Color.white);
        c.add(clear);

        submit = new JButton("Submit");
        submit.setBounds(278, 320, 100, 40);
        submit.setBackground(Color.lightGray);
        submit.setFont(f);
        submit.setForeground(Color.white);
        c.add(submit);

        txtara = new JTextArea();
        txtara.setBounds(50, 380, 382, 250);
        txtara.setBackground(Color.white);
        txtara.setForeground(Color.black);
        txtara.setFont(f);
        c.add(txtara);

        JLabel lb2 = new JLabel();
        lb2.setFont(f);
        lb2.setBounds(50, 550, 150, 80);
        lb2.setBackground(Color.white);
        lb2.setForeground(Color.black);
        c.add(lb2);

        JLabel lb3 = new JLabel();
        lb3.setFont(f);
        lb3.setBounds(50, 250, 150, 80);
        lb3.setForeground(Color.black);
        c.add(lb3);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nam = nm.getText();
                String acc_no = acc.getText();
                txtara.append("Name : " + nam + "\n");
                txtara.append("Account No : " + acc_no + "\n");
                double d = Double.parseDouble(rec_BOT.getText());
                double d1 = d * 5.612;
                double d2 = Double.parseDouble(du.getText());
                double d3 = d2 * 5.612;
                double d4 = d3 + d1;
                // String s = String.valueOf(d4);
                String s1 = cb.getSelectedItem().toString();
                if (s1 == "January" || s1 == "March" || s1 == "May" || s1=="July" || s1=="August" || s1=="October" || s1=="December") {
                    double d5 = d4 * 31;
                    String s = String.valueOf(d5);
                    txtara.append("Billing       : "+s1+"\n");
                    txtara.append("Bill to Pay   : " + s+"/- Taka\n");
                } 
                else if (s1 == "February") {
                    double d5 = d4 * 28;
                    String s = String.valueOf(d5);
                    txtara.append("Billing month : "+s1+"\n");
                    txtara.append("Bill to Pay   : " + s+"/- Taka\n");
                } 
                else {

                    double d5 = d4 * 30;
                    String s = String.valueOf(d5);
                    txtara.append("Billing month : "+s1+"\n");
                    txtara.append("Bill to Pay   : " + s+"/- Taka\n");
                }

            }

        });

        clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                nm.setText("");
                acc.setText("");
                rec_BOT.setText("");
                du.setText("");
                txtara.setText("");
            }
        });

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rb1) {
                JOptionPane.showMessageDialog(null, "You are adding due !","WARNING!!!", JOptionPane.WARNING_MESSAGE);

            }

        }

    }

    public static void main(String[] args) {
        billing bill = new billing();
        bill.setTitle("Alternative of NESCO_BD by RAAD@2003042");
        bill.setVisible(true);
        bill.setBounds(150, 70, 500, 700);
        bill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
