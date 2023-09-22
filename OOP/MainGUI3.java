import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MainGUI3 {
    
    public static void main(String[] args) {
        
        // GridLayout = places components in a grid of cells
        // Each component takes all the available space within its cell,
        // and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 0, 0));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));


        frame.setVisible(true);


















        // JLayeredPane = Swing container that provides a
        //              third dimension for positioning components
        //              ex. depth, Z-index


        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
         
        layeredPane.add(label1, Integer.valueOf(0) /*JLayeredPane.DEFAULT_LAYER*/);
        layeredPane.add(label2, Integer.valueOf(1)/*JLayeredPane.DEFAULT_LAYER or the next higher layer */);
        layeredPane.add(label3, Integer.valueOf(2) /*JLayeredPane.DRAG_LAYER or the next higher layer */);

         JFrame frame1 = new JFrame();
         frame1.add(layeredPane);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(new Dimension(500, 500));
        frame1.setLayout(null);
        frame1.setVisible(true);


















        
    }
}
