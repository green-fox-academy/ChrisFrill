import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class Triangles {

    public static void mainDraw(Graphics graphics) {


        int rows = 50;
        int halfCanvasWidth = WIDTH / 2;
        int baseWidth = WIDTH / rows;
        int halfBaseWidth = WIDTH / rows / 2;
        int triangleHeight = HEIGHT / rows;
        int xOne = 0;
        int xTwo = 0;
        int xThree = 0;
        int x[] = {xOne, xTwo, xThree};
        int yOne = 0;
        int yTwoAndThree = 0;
        int y[] = {yOne, yTwoAndThree, yTwoAndThree};
        int nPoints = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                xOne = halfCanvasWidth - (i * halfBaseWidth) + (j * baseWidth);
                xTwo = (halfCanvasWidth + halfBaseWidth) - (i * halfBaseWidth) + (j * baseWidth);
                xThree = (halfCanvasWidth - halfBaseWidth) - (i * halfBaseWidth) + (j * baseWidth);
                x[0] = xOne;
                x[1] = xTwo;
                x[2] = xThree;
                yOne = (i * triangleHeight);
                yTwoAndThree = ((i + 1) * triangleHeight);
                y[0] = yOne;
                y[1] = yTwoAndThree;
                y[2] = yTwoAndThree;
                graphics.drawPolygon(x, y, nPoints);
            }
        }
    }

    // Not perfect, have to work on it.

        /*int rows = 22;
        int halfCanvasWidth = WIDTH / 2;
        int halfBaseWidth = WIDTH / rows / 2;
        int triangleHeight = WIDTH / rows;

        for (int i = 0; i < rows + 1; i++){
            graphics.drawLine(halfCanvasWidth + (i * halfBaseWidth), triangleHeight * i, i * halfBaseWidth * 2, WIDTH);
            graphics.drawLine(halfCanvasWidth - (i * halfBaseWidth), i * triangleHeight, halfCanvasWidth + (i * halfBaseWidth), i * triangleHeight);
            graphics.drawLine(halfCanvasWidth - (i * halfBaseWidth), triangleHeight * i, WIDTH - (i * halfBaseWidth * 2), WIDTH);
        }*/

//         another version which could work in the future

        /*for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < 1 + i * 2; j++) {
                if (j % 2 != 0) {
                    if (i > 0) {
                        graphics.drawLine(( halfBaseWidth + (halfCanvasWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), (i * triangleHeight), ( halfBaseWidth + halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine(( halfBaseWidth + (halfCanvasWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), (i * triangleHeight), ( halfBaseWidth + halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine((halfBaseWidth + halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), ((1 + i) * triangleHeight), (halfBaseWidth + halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth)) + (i* halfBaseWidth)), ((1 + i) * triangleHeight));
                    } else {
                        graphics.drawLine(((halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), (halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine(((halfCanvasWidth) - (j * (halfBaseWidth))), (i * triangleHeight), (halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((i * triangleHeight) + (triangleHeight)));
                        graphics.drawLine((halfCanvasWidth - (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight), (halfCanvasWidth + (halfBaseWidth) - (j * (halfBaseWidth))), ((1 + i) * triangleHeight));
                    }
                }
            }
        }*/


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
