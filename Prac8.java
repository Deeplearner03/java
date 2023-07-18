import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prac8 extends Applet implements ActionListener {
    Button b1 = new Button("Red");

    public void init() {
        setLayout(null);
        b1.setBounds(50, 50, 80, 20);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) {
            b1.setLabel("Green");
            setBackground(Color.RED);
        } else if (e.getActionCommand().equals("Green")) {
            b1.setLabel("Blue");
            setBackground(Color.GREEN);
        } else {
            b1.setLabel("Red");
            setBackground(Color.BLUE);
        }
    }
}/*
  * <applet code= "Prac8.class" height=500 width=300>
  * 
  * </applet>
  */
