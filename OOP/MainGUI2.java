import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainGUI2 {
    
    public static void main(String[] args) {
        
        // JButton = a button that performs an action when clicked on

        new MyFrame2();








        //Layout Manager = Defines the natural layout for components within a container

        // 3 common managers

        // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
        // All extra space is placed in the center area


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10)); // THE VALUES SET THE MARGIN
        frame. setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel5.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //------------Sub Panels---------------------//

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        

        panel6 .setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);
        //----------------Sub Panels---------------------------//

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);














        // FlowLayout = places components in a row, sized at their preferred size
        // If the horizontal space in the container is too small
        // the FlowLayout class uses the available row.

        
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 500);
        frame1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10 ));

        JPanel panele = new JPanel();
        panele.setPreferredSize(new Dimension(250, 250));
        panele.setBackground(Color.lightGray );
        panele.setLayout(new FlowLayout());
        

       panele.add(new JButton("1")) ; 
       panele.add(new JButton("2")) ; 
       panele.add(new JButton("3")) ; 
       panele.add(new JButton("4")) ; 
       panele.add(new JButton("5")) ; 
       panele.add(new JButton("6")) ; 
       panele.add(new JButton("7")) ; 
       panele.add(new JButton("8")) ; 
       panele.add(new JButton("9")) ; 

       frame1 .add(panele);
       frame1.setVisible(true); 
    }
}
