import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){
         
        JFrame frame = new JFrame();// creates a this
        this.setTitle("Jthis title goes here");// sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false);// prevent this from being resized
        this.setSize(420, 420);// sets the x-dimension, and y-dimension of this
        this.setVisible(true);// makes this visible

        ImageIcon image = new ImageIcon("R.png");// create an ImageIcon // chan
        this.setIconImage(image.getImage()); // change icon of this
        this.getContentPane().setBackground(new Color(125, 50, 250));// change color of background
    }
     
}
