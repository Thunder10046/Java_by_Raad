import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class code_frame extends JFrame {

    private Container c;
    private JLabel label, label2;
    private Font f;

    code_frame() {
        installing_components();

    }

    public void installing_components() {

        c = this.getContentPane();
        c.setLayout(null);// to randomize the position of the label by programmer
        c.setBackground(Color.gray); // Changing the color of the whole container where the frame is set.

        f = new Font("Times New Roman", Font.BOLD, 18);

        label = new JLabel();
        label.setText("Enter Your Name: ");
        label.setBounds(50, 20, 200, 50);
        label.setFont(f);
        label.setOpaque(true); //to add border around text
        label.setBackground(Color.lightGray);
        label.setToolTipText("Example(Raad)"); //to add tips when placing the curser to the label
        c.add(label); // to add lebel in the container

        label2 = new JLabel();
        label2.setText("Enter Your Contact: ");
        label2.setBounds(50, 90, 200, 50);
        label2.setFont(f);
        label2.setOpaque(true);
        label2.setBackground(Color.lightGray);
        label2.setToolTipText("Example(0171XXXXXXX)");
        c.add(label2);// to add multiple label

        ImageIcon img = new ImageIcon(getClass().getResource("engrr.png"));
        this.setIconImage(img.getImage()); // setting an icon

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 200, 500, 500);
        setTitle("Frame created by Ahmed Raad, Roll : 20 03 042");
        setResizable(true); // visibling the frame
    }

    public static void main(String[] args) {
        code_frame frame = new code_frame();

    }

}