
import java.awt.*;

public class MyFrame extends Frame {
    MyFrame() {
        setTitle("Myframe");
        setSize(500, 500);
        Label l = new Label("I am a frame's label");
        add(l);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}