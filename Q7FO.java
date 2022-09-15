import javax.swing.JFrame;
import java.awt.*;
public class Q7FO extends JFrame{
    public Q7FO (){
        setTitle("Q7 ");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint (Graphics A){
        A.setColor(Color.pink);
        A.fillRect(300,300,250,250);
        A.setColor(Color.magenta);
        A.fillRect(250,250,150,150);
    }
    public static void main(String[] args) {
        Q7FO AH = new Q7FO();
        AH.paint(null);

    }
    }

