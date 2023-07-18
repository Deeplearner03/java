import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prac6 extends Applet implements ActionListener {
    Button b1 = new Button("Start");
    public void init() {
        setLayout(null);
        b1.setBounds(50, 50, 80, 20);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            b1.setLabel("Stop");
        } else {
            b1.setLabel("Start");
        }
    }   
}/*
 * <applet code= "Prac6.class" height=500 width=300>
 * 
 * </applet>
 */
