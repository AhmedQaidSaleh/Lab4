import java.awt.Color;
import javax.swing.*;

public class Q10FO
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        JLabel label = new JLabel("Hello, Ahmed!");
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);

        /** JLabel image = new JLabel(new ImageIcon("aa.jpg"));
         image.setSize(200,200);
         image.setOpaque(true);
         label.add(image);
         label.add(label);
         frame.add(label);*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}