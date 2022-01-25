import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Myframe extends JFrame {//myframe menjadi sub class dari Jframe->bisa mengakses secara bebeas methode kelas jframe
        //create manual constructor of class Myframe
        Myframe(){
            //Jframe adalah gui untuk menambahkan component
           //JFrame frame = new JFrame();//membuat object dari kelas JFrame

           //JFrame frame = new JFrame() adalah this, this disini adalah 
           
           //instance dari class atau object dari kelas yg dijalankan pada constructor
           
           //atau this disini adalah Myframe itu sendiri jika tidak berisikan object yg dibuat pada main
           
            this.setVisible(true);//membuat frame terlihat
            this.setSize(500,500);//set dimensi x dan y dari frame
                        // x    y
            this.setTitle("GULAG");//set judul dari frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out dari app dengan default click x pada frame
            //EXIT jika mengclick close bisa DO_NOTHING wkkwkw
            //close operation di set secara default
            this.setResizable(false);//size pada frame ga bisa di rubah secara manual oleh user
            
            //ImageIcon image = new ImageIcon(".//res//logo.png");//create ImageIcon
            ImageIcon image = new ImageIcon("D:/Desktop Programing/jfx_latihan/frame/src/res/komunisme.png");
            this.setIconImage(image.getImage());//change logo java to my logo
    
            //frame.getContentPane().setBackground(Color.red);//set atomatis background
            //frame.getContentPane().setForeground(Color.red);
            
            //set rgb value background
            this.getContentPane().setBackground(new Color(255,50,50));
            //set hexadesimal value background
            //frame.getContentPane().setBackground(new Color(0xFFFFFF))
        }
}
