import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.green);
        int halfCanvasWidth = WIDTH / 2;
        int halfCanvasHeight = HEIGHT / 2;
        int lineDistance = WIDTH / 500;
        for (int i = 0; i <= halfCanvasHeight; i += lineDistance) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(halfCanvasWidth, i, halfCanvasWidth  - i, halfCanvasHeight);
            graphics.setColor(Color.PINK);
            graphics.drawLine(halfCanvasWidth, i, halfCanvasWidth  + i, halfCanvasHeight);

            graphics.setColor(Color.CYAN);
            graphics.drawLine(halfCanvasWidth-i, halfCanvasHeight, halfCanvasWidth , WIDTH - i);
            graphics.setColor(Color.ORANGE);
            graphics.drawLine(halfCanvasWidth, HEIGHT - i, halfCanvasWidth + i, halfCanvasHeight);
        }
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        EnvelopeStar.ImagePanel panel = new EnvelopeStar.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

