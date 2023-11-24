import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    JFrame frame;
    ImageIcon icon;
    Frame(){

        ImageIcon icon = new ImageIcon("C:\\Users\\STAGKOSARISTEIDIS\\IdeaProjects\\Frame\\Images\\Hacker.png");

        frame = new JFrame();
        frame.setTitle("Frame");
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setBounds(500,600,450,450);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);

    }

}
