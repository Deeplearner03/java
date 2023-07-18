import java.applet.Applet;
import java.awt.*;

public class Prac1 extends Applet {
    public void paint(Graphics g) {
        int h = getSize().height;
        int w = getSize().width;
        g.drawOval((w / 2) - 50, (h / 2) - 50, 100, 100);
        Color red = new Color(255, 0, 0);
        g.setColor(red);
        g.drawString("Samir", w / 2 - 12, h / 2);
    }
}

/*
 * <applet code= "Prac1.class" height=500 width=300>
 * 
 * </applet>
 */