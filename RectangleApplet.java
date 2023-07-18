import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RectangleApplet extends Applet implements ActionListener {
    private TextField widthField, heightField;
    private Button drawButton;
    private int width, height;

    public void init() {
        // Create text fields for width and height
        widthField = new TextField(10);
        heightField = new TextField(10);

        // Create button to draw rectangle
        drawButton = new Button("Draw Rectangle");
        drawButton.addActionListener(this);

        // Add components to applet
        add(new Label("Width: "));
        add(widthField);
        add(new Label("Height: "));
        add(heightField);
        add(drawButton);
    }

    public void actionPerformed(ActionEvent e) {
        // Get width and height from text fields
        try {
            width = Integer.parseInt(widthField.getText());
            height = Integer.parseInt(heightField.getText());
        } catch (NumberFormatException ex) {
            // Invalid input, do nothing
            return;
        }

        // Repaint applet to draw rectangle
        repaint();
    }

    public void paint(Graphics g) {
        // Draw rectangle with given width and height
        g.drawRect(50, 50, width, height);
    }
}
// <applet code="RectangleApplet.class" width="600" height ="500">
// </applet>