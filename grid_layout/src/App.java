import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
public class App {
    public static void main(String[] args) throws Exception {
        //gird layout adalah menempatkan komponen dalam gird kolom dengan 
        //beberapa componnent mengambil semua space variabel dengan kolom tersebut
        //dan beberapa kolom adalah size yang sama
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,4,10,5));// row colom vertikal horizontal
        //Annyoumous object new JButton("x") wkwkwk pass parameter dengan constructor
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        //kalau ga set layout pada frame variabel akhir akan mengambil semua space kolom dimana kolom yg lain ditumpuk
    }
}
