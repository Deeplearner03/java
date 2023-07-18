import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrameApplet extends Applet {
    private Frame frame; // Declare a Frame instance variable

    public void init() {
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        frame = new Frame("My Frame"); // Create the frame and set its title
        frame.setSize(300, 200); // Set the size of the frame
        // Create a label and add it to the frame
        Label label = new Label("Hello, world!");
        frame.add(label);
    }

    public void start() {
        frame.setVisible(true); // Show the frame when the applet starts
    }

    public void stop() {
        frame.setVisible(false); // Hide the frame when the applet stops
    }

}
// <applet code="MyFrameApplet.class" width="500" height ="400">
// </applet>