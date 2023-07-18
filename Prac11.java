import java.applet.Applet;
import java.awt.*;

public class Prac11 extends Applet {
    public void paint(Graphics g) {
        int xpos = getSize().width, ypos = getSize().height, h = 200, w = 300, x, y;
        for (int i = 0; i < 10; i++) {
            x = xpos / 2 - w / 2;
            y = ypos / 2 - h / 2;
            if (i % 2 == 0) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, w, h);
            }
            h -= 20;
            w -= 30;
        }
    }
}

/*
 * <applet code= "Prac11.class" height=400 width=300>
 * 
 * </applet>
 */
