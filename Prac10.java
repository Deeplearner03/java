import java.awt.*;
import java.awt.event.*;

public class Prac10 extends Frame implements ActionListener {
    Label l = new Label();
    MenuBar mb = new MenuBar();
    Menu mainmenu = new Menu("select");
    MenuItem i1 = new MenuItem("Item 1");
    MenuItem i2 = new MenuItem("Item 2");
    MenuItem i3 = new MenuItem("Item 3");
    MenuItem i4 = new MenuItem("Item 4");
    MenuItem i5 = new MenuItem("Item 5");

    Prac10() {
        mb.add(mainmenu);
        mainmenu.add(i1);
        mainmenu.add(i2);
        mainmenu.add(i3);
        mainmenu.add(i4);
        mainmenu.add(i5);
        add(l);
        setMenuBar(mb);
        setSize(500, 500);
        setVisible(true);
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        mainmenu.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText(e.getActionCommand());
    }

    public static void main(String[] args) {
        new Prac10();
    }

}