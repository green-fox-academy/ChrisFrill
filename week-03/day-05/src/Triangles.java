import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {

        // Not perfect, have to work on it.

        int rows = 22;
        int halfCanvasWidth = WIDTH / 2;
        int halfBaseWidth = WIDTH / rows / 2;
        int triangleHeight = WIDTH / rows;

        for (int i = 0; i < rows + 1; i++){
            graphics.drawLine(halfCanvasWidth + (i * halfBaseWidth), triangleHeight * i, i * halfBaseWidth * 2, WIDTH);
            graphics.drawLine(halfCanvasWidth - (i * halfBaseWidth), i * triangleHeight, halfCanvasWidth + (i * halfBaseWidth), i * triangleHeight);
            graphics.drawLine(halfCanvasWidth - (i * halfBaseWidth), triangleHeight * i, WIDTH - (i * halfBaseWidth * 2), WIDTH);
        }

        /* another version which could work in the future
        int rows = 10;
        int halfCanvasWidth = WIDTH / 2;
        int halfBaseWidth = WIDTH / rows / 2;
        int triangleHeight = WIDTH / rows;
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < 1 + i * 2; j++) {
                if (j % 2 != 0) {
                    if (i > 0) {
                        graphics.drawLine(( halfBaseWidth + (halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), ( halfBaseWidth + halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine(( halfBaseWidth + (halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), ( halfBaseWidth + halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine((halfBaseWidth + halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight), (halfBaseWidth + halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight));
                    } else {
                        graphics.drawLine(((halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), (halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine(((halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), (halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine((halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight), (halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight));

                    }
                }
            }
        }*/


    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Triangles.ImagePanel panel = new Triangles.ImagePanel();
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
