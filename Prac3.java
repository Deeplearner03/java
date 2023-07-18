import java.applet.Applet;
import java.awt.*;

public class Prac3 extends Applet {
    public void paint(Graphics g) {
        int h = getSize().height;
        int w = getSize().width;
        g.drawRect(w / 2 - 100, h / 2 - 12, 200, 50);
        int x = w / 2 - 100;
        g.setColor(Color.green);
        for (int i = 0; i < 5; i++) {
            g.fillRect(x, h / 2 - 12, 40, 50);
            x += 40;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

/*
 * <applet code= "Prac3.class" height=500 width=500>
 * 
 * </applet>
 */