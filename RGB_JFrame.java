import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGB_JFrame extends JFrame implements ActionListener {

    private JButton button;
    private Container contentPane;
    private int colorIndex;
    private Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

    public RGB_JFrame() {
        super("Color Cycle Using JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        button = new JButton("Change Color");
        button.addActionListener(this);
        contentPane.add(button);
        colorIndex = 0;
    }

    public void actionPerformed(ActionEvent e) {
        colorIndex = (colorIndex + 1) % colors.length;
        contentPane.setBackground(colors[colorIndex]);
    }

    public static void main(String[] args) {
        RGB_JFrame frame = new RGB_JFrame();
        frame.setVisible(true);

    }
}
