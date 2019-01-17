package circles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {


    private static void mainDraw(Graphics g) {
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static Point middle = new Point(screenSize.width / 2 , screenSize.height / 2 );
    static JFrame jFrame = new JFrame("Drawing");

    public static void main(String[] args) {
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setVisible(true);
        jFrame.pack();
        Point newLocation = new Point(middle.x - (jFrame.getWidth() / 2),
                middle.y - (jFrame.getHeight() / 2));
        jFrame.setLocation(newLocation);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
