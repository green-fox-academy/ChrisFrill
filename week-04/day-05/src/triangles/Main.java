package triangles;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main  {

    private static void mainDraw(Graphics g) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        Triangles triangles = new Triangles();
        triangles.drawTriangleFractal(g, 0, 0, 900);
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
        panel.setBackground(Color.darkGray);
        jFrame.add(panel);
        jFrame.setVisible(true);
        jFrame.pack();
        Point newLocation = new Point(middle.x - (jFrame.getWidth() / 2),
                middle.y - (jFrame.getHeight() / 2));
        jFrame.setLocation(newLocation);
    }

    static class ImagePanel extends Canvas {
        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            try {
                mainDraw(graphics);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
