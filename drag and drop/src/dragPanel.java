import javax.swing.ImageIcon;
import javax.swing.JLabel;


import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.Point;
public class dragPanel extends JLabel {
    ImageIcon image = new ImageIcon("D:/Desktop Programing/jfx_latihan/drag and drop/smile.jpg");
    final int width=image.getIconWidth();
    final int height=image.getIconHeight();
    Point imageCorner;//point disini sebagai posisi object
    Point prevPt;
    dragPanel(){
        
        imageCorner = new Point(0,0);
        //posisinya akan paling atas pojok
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);
    }
    public void paintComponent(Graphics g){
    //repaint your image after we update the new position
    super.paintComponent(g);//refresh graphic gambar yg udah di geser
    image.paintIcon(this, g, (int)imageCorner.getX(),(int) imageCorner.getY());

    }
    
    private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e){
            prevPt=e.getPoint();
            //smeua yang telah dilakukan di update di previous point ketika kita click
            //dan itu untuk click listener kita
        }
    }
    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e){
            Point currentPt =e.getPoint();
            //menyimpan sebuah posisi object sekrang
            imageCorner.translate(
                (int)(currentPt.getX()-prevPt.getX()),//x
                (int)(currentPt.getY()-prevPt.getY())//y
            );
            //mentranslate sebuah imagecorner ke new posisi
            prevPt = currentPt;
            repaint();//menuangkan ulang gambar dengan posisi yg baru
        }
    }
}
