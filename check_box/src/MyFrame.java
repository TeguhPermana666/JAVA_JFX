import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    ImageIcon xIcon;
    ImageIcon vIcon;
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.DARK_GRAY);

        xIcon=new ImageIcon("D:/Desktop Programing/jfx_latihan/check_box/x_logo.png");
        vIcon= new ImageIcon("D:/Desktop Programing/jfx_latihan/check_box/corret_Logo.png");


        button=new JButton();
        button.setText("Sumbit");
        button.setFont(new Font("Times New Roman",Font.PLAIN,20));
        button.setForeground(Color.blue);
        button.setBackground(Color.orange);
        button.addActionListener(this);
        button.setFocusable(false);

        
        checkBox=new JCheckBox();
        checkBox.setFocusable(false);
        checkBox.setText("Are U Gay?");
        checkBox.setFont(new Font("Arial",Font.BOLD,30));
        checkBox.setForeground(Color.BLACK);
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(vIcon);
        checkBox.setBackground(Color.white);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
        
    }
}
