import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*import java.awt.event.ActionListener;//adalah abstrak kelas
import java.awt.event.ActionEvent;*/
public class App  {
    //public class App implements ActionListener
    public static void main(String[] args) throws Exception {
        //flow layout =>menempatkan komponen dalam row(baris),sized at prefered size
        //jika pada horizontal space terlalu kecil pada container maka flow layout 
        //menggunakan next row yang tersedia

        //create frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        //create button
        JButton button1 = new JButton(); //or JButton("1")
        JButton button2 = new JButton(); //or JButton("2")
        JButton button3 = new JButton(); //or JButton("3")
        JButton button4 = new JButton(); //or JButton("4")
        JButton button5 = new JButton(); //or JButton("5")
        
        button1.setText("1");
        button1.setFocusable(false);

        button2.setText("2");
        button2.setFocusable(false);

        button3.setText("3");
        button3.setFocusable(false);
        button4.setText("4");
        button4.setFocusable(false);

        button5.setText("5");
        button5.setFocusable(false);
        //new JButton().addActionListener((ActionListener)frame);
        /*
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        */

        JPanel panel = new JPanel();
        panel.setBounds(300, 300, 0, 0);
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(100,200));
        //panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        frame.add(panel);
        //atau bisa gini jadi ga usah buat object banyak banyak cukup panggil constructor acces dan include argumennya
        /*
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        */

    }
/*
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==new JButton()){
           System.out.println(e);
       }
        
    }*/
}
