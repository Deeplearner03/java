import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Demo extends Applet {
	public void init(){
		Canvas c = new Canvas();
		c.setSize(100,100);
		c.setBackground(Color.CYAN);
		add(c);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hello",20,20);
	}
}
/*
 * <applet code= "Demo.class" height=500 width=300>
 * 
 * </applet>
 */