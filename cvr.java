import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
public class cvr extends JFrame implements ActionListener{

    private Container c;
    private JLabel label, label2;
    private Font f;
    

    cvr() {
        installing_components();

        JTextField txt = new JTextField();
        txt.setBounds(130,50,200,50);
        txt.setBackground(Color.LIGHT_GRAY);
        c.add(txt);
    }

    public void installing_components() {

        
        c = this.getContentPane();
        c.setLayout(null);// to randomize the position of the label by programmer
        c.setBackground(Color.gray); // Changing the color of the whole container where the frame is set.

        f = new Font("Times New Roman", Font.BOLD, 15);

        label = new JLabel();
        label.setText("Input $: ");
        label.setBounds(50, 20, 200, 50);
        label.setFont(f);
        c.add(label);

        label2 = new JLabel();
        label.setBounds(50, 40, 200, 50);
        label.setFont(f);
        c.add(label2);

        
        JButton bt = new JButton("Convert");
        bt.setBounds(50,150,150,50);
        bt.setBackground(Color.LIGHT_GRAY);
        c.add(bt);

        bt.addActionListener(this);


        ImageIcon img = new ImageIcon(getClass().getResource("engrr.png"));
        this.setIconImage(img.getImage()); // setting an icon

        


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 200, 500, 500);
        setTitle("Frame created by Ahmed Raad, Roll : 20 03 042");
        setResizable(true); // visibling the frame
    }

    public void actionPerformed(ActionEvent e) {
		
        double d = Double.parseDouble(txt.getText());
        double d1 = (d*100);
        JOptionPane.showMessageDialog(null, "Taka: "+ d1);

    }

    public static void main(String[] args) {
        
        String pass = 2003042;
        Sring acc;
        JOptionPane.showMessageDialog(null, "Enter Password:", "Access", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showInputDialog(null, acc);
        PasswordAuthentication(pass, 2003042); 
        if (acc==pass) {
            cvr frame = new cvr();    
        } 
        else
        {
            JOptionPane.showConfirmDialog(null, "You Have Entered Wrong Password","Access",JOptionPane.ERROR_MESSAGE );
        }
        

    }

}