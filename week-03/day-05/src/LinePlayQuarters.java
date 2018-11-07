import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics) {

        /* To understand the method
        for (int i = 0; i <= WIDTH; i += WIDTH / (square * 20)) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, i, i, HEIGHT);
            graphics.setColor(Color.PINK);
            graphics.drawLine(i, 0, WIDTH, i);
        }*/

        int divideInto = 1;
        int square = (int) (Math.sqrt(divideInto));
        for (int j = 0; j < square; j++) {
            for (int k = 0; k < square; k++) {
                for (int i = 0; i <= WIDTH / square; i += WIDTH / (square * 20)) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine((k * WIDTH / square), ((j * WIDTH / square) + i), ((k * WIDTH / square) + i), ((j * (WIDTH / square)) + (WIDTH / square)));
                    graphics.setColor(Color.PINK);
                    graphics.drawLine(((k * WIDTH / square) + i), (j * WIDTH / square), ((k * (WIDTH / square)) + (WIDTH / square)), ((j * WIDTH / square) + i));
                }
            }
        }

        divideInto = 4;
        square = (int) (Math.sqrt(divideInto));
        for (int j = 0; j < square; j++) {
            for (int k = 0; k < square; k++) {
                for (int i = 0; i <= WIDTH / square; i += WIDTH / (square * 20)) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine((k * WIDTH / square), ((j * WIDTH / square) + i), ((k * WIDTH / square) + i), ((j * (WIDTH / square)) + (WIDTH / square)));
                    graphics.setColor(Color.PINK);
                    graphics.drawLine(((k * WIDTH / square) + i), (j * WIDTH / square), ((k * (WIDTH / square)) + (WIDTH / square)), ((j * WIDTH / square) + i));
                }
            }
        }
        divideInto = 16;
        square = (int) (Math.sqrt(divideInto));
        for (int j = 0; j < square; j++) {
            for (int k = 0; k < square; k++) {
                for (int i = 0; i <= WIDTH / square; i += WIDTH / (square * 20)) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine((k * WIDTH / square), ((j * WIDTH / square) + i), ((k * WIDTH / square) + i), ((j * (WIDTH / square)) + (WIDTH / square)));
                    graphics.setColor(Color.PINK);
                    graphics.drawLine(((k * WIDTH / square) + i), (j * WIDTH / square), ((k * (WIDTH / square)) + (WIDTH / square)), ((j * WIDTH / square) + i));
                }
            }
        }

        divideInto = 64;
        square = (int) (Math.sqrt(divideInto));
        for (int j = 0; j < square; j++) {
            for (int k = 0; k < square; k++) {
                for (int i = 0; i <= WIDTH / square; i += WIDTH / (square * 20)) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine((k * WIDTH / square), ((j * WIDTH / square) + i), ((k * WIDTH / square) + i), ((j * (WIDTH / square)) + (WIDTH / square)));
                    graphics.setColor(Color.PINK);
                    graphics.drawLine(((k * WIDTH / square) + i), (j * WIDTH / square), ((k * (WIDTH / square)) + (WIDTH / square)), ((j * WIDTH / square) + i));
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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
