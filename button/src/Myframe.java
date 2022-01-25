import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    int i =1;
    //button taruh global supaya tidak return lagi dari constructor myframe ke action
    JButton button;//object tidak returned constructor
    JLabel label;//object tidak returend constructor
    Myframe(){
        ImageIcon image1 = new ImageIcon("D:/Desktop Programing/jfx_latihan/button/logo.png");
        ImageIcon image2 = new ImageIcon("D:/Desktop Programing/jfx_latihan/button/kimoci.png");
        
        label=new JLabel();
        label.setIcon(image2);
        label.setBounds(220, 220, 150, 150);
        label.setVisible(false);
        
        button= new JButton();//atribut button return constructor 
        button.addActionListener(this);//this ini berisikan action performed
        

        /**
         tombol button menambahkan action listener yg berarti click on tombol
         yg mana mengargumenkan this(frame)jadi jika tombol button pada frame ditekan
         maka action aktif dan override methode dan return action aktif sebagai argumen
         e pada class action event, kemudian e dipanggil methode getsource yg berarti
         mengambil source yg berisikan return nilai      button.addActionListener(this);
         apakah aktif (click) atau ga (no click)
         */
        //or used lamda
        //button.addActionListener(e->System.out.Println("KIMOCI AHH"))
        //remove interface and override function
        //set button
        button.setBounds(180,100,150,150);
        button.setIcon(image1);
        button.setText("I Am a Button");
        button.setFocusable(false);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,14));
        button.setIconTextGap(-5);
        button.setForeground(Color.red);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.add(label);
        
    }
    //langsung override ke function sini
    @Override//membuat fungsi yg sama dari parent ke child dari action listener
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //getsource adalah return alamat object yg diclick
            //button adalah daerah alamat button
            System.out.println("KIMOCI AHH");
            if(i==3){
                label.setVisible(true);
                button.setEnabled(false);
            }
            i++;
        }
        
    }
}
