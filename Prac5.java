import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prac5 extends Applet implements MouseMotionListener {
    Label l = new Label();
    public void init() {
        setLayout(null);
        l.setBounds(5, 5, 150, 20);
        add(l);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e) {
        int x = e.getX() , y = e.getY();
        l.setText("Mouse Position : X = "+x+" Y = "+y);
    } 
    public void mouseMoved(MouseEvent e) {
        int x = e.getX() , y = e.getY();
        l.setText("Mouse Position : X = "+x+" Y = "+y);
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 10);
    }    
}
/*
 * <applet code= "Prac5.class" height=500 width=300>
 * 
 * </applet>
 */
