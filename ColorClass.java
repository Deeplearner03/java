
import java.awt.*;

public class ColorClass extends Frame {
    ColorClass() {
        this.setTitle("ColorDemo");
        this.setSize(500, 500);
        this.setVisible(true);
        Color c = new Color(255, 0, 0, 255);
        this.setBackground(c);
    }

    public static void main(String[] args) {
        new ColorClass();
    }
}