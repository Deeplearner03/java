import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prac9 extends Applet implements ItemListener {
    Checkbox red = new Checkbox("Red");
    Checkbox green = new Checkbox("Green");
    Checkbox blue = new Checkbox("Blue");
    Canvas cnv = new Canvas();

    public void init() {
        add(red);
        add(green);
        add(blue);
        add(cnv);
        setLayout(null);
        red.setBounds(20, 400, 80, 20);
        green.setBounds(110, 400, 80, 20);
        blue.setBounds(200, 400, 80, 20);
        cnv.setBounds(120, 50, 30, 30);
        red.addItemListener(this);
        green.addItemListener(this);
        blue.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        int r = 0, g = 0, b = 0;
        if (red.getState() == true) {
            r = 255;
        }
        if (green.getState() == true) {
            g = 255;
        }
        if (blue.getState() == true) {
            b = 255;
        }
        cnv.setBackground(new Color(r, g, b));
    }
}

/*
 * <applet code= "Prac9.class" height=500 width=500>
 * 
 * </applet>
 */