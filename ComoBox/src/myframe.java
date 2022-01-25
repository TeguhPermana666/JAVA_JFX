import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
public class myframe extends JFrame implements ActionListener {
    JComboBox box;
    myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String Nama []={"Teguh","Raden","Ade"};
        box= new JComboBox(Nama);
        box.addActionListener(this);
        /*
        box.setEditable(true);

        box.addItem("FUCKER");
        box.insertItemAt("FICK", 0);

        box.setSelectedIndex(2);
        
        box.removeItem("Teguh");
        box.removeItemAt(1);
        box.removeAllItems();
        */

        this.add(box);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==box){
            System.out.println(box.getSelectedItem());
        }
    }
}
