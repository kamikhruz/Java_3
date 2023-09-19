import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class Main4 {
    // JFrame = a GUI window to add components to

    public static void main(String[] args) {
/* 
        JFrame frame = new JFrame();// creates a frame
        frame.setTitle("JFrame title goes here");// sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        frame.setResizable(false);// prevent frame from being resized
        frame.setSize(420, 420);// sets the x-dimension, and y-dimension of frame
        frame.setVisible(true);// makes frame visible

        ImageIcon image = new ImageIcon("R.png");// create an ImageIcon // chan
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(125,50,250));// change color of background
*/

       // MyFrame myFrame = new MyFrame();


















        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("bonkers2.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel(); // creates a JLabel
        label.setText("Bro, do you even code?");// set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set Text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00));// set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(-5); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon+text within label
        //label.setBounds(0, 0, 250, 250);// x = 0 , y = 0 is top-left corner


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.setIconImage(image.getImage());

        frame.pack(); // resize all components in it, also all components must already be in the frame before calling the method
    }
}
