import java.awt.*;
import java.awt.event.*;

public class RGB_Frame extends Frame implements ActionListener {

    private Button button;
    private int colorIndex;
    private Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

    public RGB_Frame() {
        super("Color Cycle");
        setSize(300, 300);
        setLayout(new FlowLayout());
        button = new Button("Change Color");
        button.addActionListener(this);
        add(button);
        colorIndex = 2;
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        colorIndex = (colorIndex + 1) % colors.length;
        setBackground(colors[colorIndex]);
    }

    public static void main(String[] args) {
        new RGB_Frame();
    }
}
