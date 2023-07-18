import java.awt.Frame;
import java.awt.Graphics;

public class GraphicsDemo extends Frame {
    GraphicsDemo() {
        setVisible(true);
        setSize(500, 400);
        setTitle("Graphics Demo");
    }

    public void paint(Graphics a) {
        a.drawRect(100, 100, 40, 40);
        a.fillRect(50, 50, 70, 30);
        a.drawOval(400, 50, 20, 10);
        a.drawLine(20, 60, 80, 100);

    }

    public static void main(String[] args) {
        GraphicsDemo gd = new GraphicsDemo();
    }
}
