import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class input_box extends JFrame {

    private Container c;
    private JTextField txt1, txt2;

    input_box() {
        install();
    }

    public void install() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);

        txt1 = new JTextField();
        txt1.setBounds(50, 50, 200, 50);
        txt1.setForeground(Color.black);
        txt1.setBackground(Color.gray);
        c.add(txt1);

        txt2 = new JTextField();
        txt2.setBounds(50, 90, 200, 50);
        txt2.setForeground(Color.black);
        txt2.setBackground(Color.gray);
        c.add(txt2);

        txt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s = txt1.getText();
                    JOptionPane.showMessageDialog(null,s+ "Output is Dispatched! ");
                }
        });
        

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 200, 500, 500);

    }

    public static void main(String[] args) {
        input_box frame = new input_box();
    }

}