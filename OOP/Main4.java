import javax.swing.JFrame;

public class Main4 {
    // JFrame = a GUI window to add components to

    public static void main(String[] args) {

        JFrame frame = new JFrame();// creates a frame
        frame.setTitle("JFrame title goes here");// sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        frame.setResizable(false);// prevent frame from being resized
        frame.setSize(420, 420);// sets the x-dimension, and y-dimension of frame
        frame.setVisible(true);// makes frame visible

    }
}
