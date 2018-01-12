import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    //constructor

    public GUI() {

        super();
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout( ));

        JLabel label1 = new JLabel("Welcome to GPA Calculator");
        add(label1, BorderLayout.CENTER);

        getContentPane().setBackground(Color.LIGHT_GRAY);
    }




}
