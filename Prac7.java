import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prac7 extends Applet implements MouseListener {
    Label l = new Label();
    public void init() {
       addMouseListener(
        new MouseListener() {
            public void mousedPressed() {
                l.setText("Mouse Pressed");
            }
            public void mousedReleased() {
                l.setText("Mouse Released");
            }
        }
       ); 
    }
}
/*
 * <applet code= "Prac7.class" height=500 width=300>
 * 
 * </applet>
 */
