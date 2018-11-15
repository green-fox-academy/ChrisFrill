package squares;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        drawSquareFractal(graphics,0, 0,size);
    }

    public static void drawSquareFractal(Graphics g, int x, int y, int size) {
        if (size <= 0) {
            return;
        } else {
            g.drawRect(x, y, size, size);
            g.drawRect(x + size / 3, y,  size / 3, size / 3);
            g.drawRect(x + size / 3,  y + size / 3 * 2, size / 3, size / 3);
            g.drawRect(x, y + size / 3, size / 3, size / 3);
            g.drawRect(x + 2 * size / 3, y + size / 3, size / 3, size / 3);

            drawSquareFractal(g, x + size / 3, y, size / 3);
            drawSquareFractal(g, x + size / 3, y + size / 3 * 2, size / 3);
            drawSquareFractal(g, x, y + size / 3, size / 3);
            drawSquareFractal(g, x + size / 3 * 2, y + size / 3 , size / 3);
            return;
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
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setVisible(true);
        jFrame.pack();
        Point newLocation = new Point(middle.x - (jFrame.getWidth() / 2),
                middle.y - (jFrame.getHeight() / 2));
        jFrame.setLocation(newLocation);
    }

    public static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
