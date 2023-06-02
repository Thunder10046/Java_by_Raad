import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.LabelUI;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;

public class multiplication extends JFrame{
    private JLabel imagLabel, label; 
    private JTextArea txtarea;
    private ImageIcon img; 
    private JTextField txt; 
    private JButton act;
    private Font f; 
    private Cursor curse;
    private Container c; 
    

    multiplication()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        img = new ImageIcon(getClass().getResource("engrr.png"));

        imagLabel = new JLabel(img);
        imagLabel.setBounds(20,30,img.getIconWidth(), img.getIconHeight());
        c.add(imagLabel);

        f = new Font("Times New Roman", Font.BOLD, 20);

        label = new JLabel();
        label.setFont(f);
        label.setForeground(Color.white);
        label.setText("Enter Any Interger Number: ");
        label.setBounds(20,30,300,160);
        c.add(label);

        txt = new JTextField();
        txt.setFont(f);
        txt.setBounds(280,80,200,60);
        c.add(txt);

        curse = new Cursor(Cursor.HAND_CURSOR); 

        act = new JButton("Clear");
        act.setForeground(Color.black);
        act.setCursor(curse);
        act.setBackground(Color.lightGray);
        act.setBounds(280,160,100,60);
        c.add(act);

        txtarea = new JTextArea();
        txtarea.setFont(f);
        txtarea.setBounds(20,250,120,250);
        c.add(txtarea);

        txt.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e)
            {
                    int num = Integer.parseInt(txt.getText());

                    for (int i = 1; i <=10; i++) {
                        int res = num*i;

                        String r = String.valueOf(res);
                        String n = String.valueOf(num);
                        String j = String.valueOf(i);
                        
                        txtarea.append(n+ '*' +j+ '=' +r+"\n");
                    }
            }

        });

        act.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                txt.setText("");
                txtarea.setText("");
            }
        });

    }



    public static void main(String[] args) {
    multiplication mul = new multiplication();
    mul.setVisible(true);
    mul.setBounds(400,25,600,800);
    mul.setTitle("Multiplication Table By Raad_42");
    mul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}