import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener{

    JButton button;
    JLabel label; 
    
    MyFrame2(){
        ImageIcon icon1 = new ImageIcon("thumbs.jpg");
        Image newImage1= icon1.getImage();
        Image newerImage1 = newImage1.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newerImage1);

        

        ImageIcon icon = new ImageIcon("thumbs.jpg ");
        Image newImage = icon.getImage();
        Image newerImage = newImage.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newerImage);

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150, 250,150,150);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("Pooh")); // Lamda expression - its a shortcut
        button.setText("I'm a button");
        button.setFocusable(false);       
        button.setIcon(icon); 
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Cosmic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Pooh");
            label.setVisible(false);
        }
    }
}
