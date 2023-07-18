import java.applet.Applet;
import java.awt.*;

public class Prac4 extends Applet {
    public void paint(Graphics g) {
        int n1 = Integer.parseInt(getParameter("num1"));
        int n2 = Integer.parseInt(getParameter("num2"));
        int n3 = n1 + n2;
        g.drawString("Sum of " + n1 + " and " + n2 + " is " + n3, 10, 10);
    }
}
/*
 * <applet code= "Prac4.class" height=500 width=300>
 * <param name="num1" value=10>
 * <param name="num2" value=20>
 * </applet>
 */
