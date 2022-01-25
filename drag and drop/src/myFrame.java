import javax.swing.JFrame;

public class myFrame extends JFrame{
    dragPanel drag = new dragPanel();
    myFrame(){
        this.setTitle("Drag and Drop");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        this.add(drag);
        this.setVisible(true);
    }
}