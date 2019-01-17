package hexagon;

import javax.swing.*;
import java.awt.*;

public class Hexagon {
    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        int[] xCoordiantes = {1, 2, 3};
        int[] yCoordiantes = {1, 2, 3};
        int nPoints = 6;
        drawHexagon(graphics, xCoordiantes, yCoordiantes, 5, size);
    }

    public static void drawHexagon(Graphics g, int[] x, int[] y, int nPoints, int size) {
        if (size <= 0) {
            return;
        } else {
            g.drawPolygon(x, y, nPoints);

        }
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static Point middle = new Point(screenSize.width / 2 , screenSize.height / 2 );
    static JFrame jFrame = new JFrame("Drawing");

    public static void main(String[] args) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hexagon.ImagePanel panel = new Hexagon.ImagePanel();
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
