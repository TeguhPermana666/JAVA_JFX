import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        //layout=>mendefinisikan sebuah natural layout untuk component dengan container
        //layout dibedakan menjadi 3 bagian yang akan dibahas 

        /*1.Border Layout =>border layout menempatkan komponen di 5 area diantaranya Utara,
        Selatan,timur,barat,center
        semua extra place ditempatkan pada area tengah        
        */
        int width_margin=10;//atur margin lebar
        int hight_margin=10;//atur margin panjang

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //set borderlayout dengan frame dan atur borderlayout pada container
        frame.setLayout(new BorderLayout(10,20));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        
        //prefered size mengeset ukuran yang disukai lebih tepatnya ukuran pada panel menjadi
        //ke size atau terukur sesuai diriku,kalau ga bakal ga prefered
        
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        
        //now set panel 5 untuk ditumpuk,dengan set panel5 memiliki layout borderlayout 
        panel5.setLayout(new BorderLayout(3,3));
        //------sub panel5---------//
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        
        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.pink);
        panel8.setBackground(Color.darkGray);
        panel9.setBackground(Color.orange);
        
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        //------sub panel5---------//
        
        //Peletakan sub panel pada panel5//
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.EAST);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.SOUTH);
        
        //mengeset border layout
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
        
    }
}
