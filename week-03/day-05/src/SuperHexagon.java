import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class SuperHexagon {

    public static void mainDraw(Graphics graphics) {


        int sides = 4;
        int rows = sides * 2 - 1;
        int oddRows = 1 + (sides - 2) * 2;
        int halfCanvasWidth = WIDTH / 2;
        int hexaWidth = WIDTH / rows ;
        int halfHexaWidth = WIDTH / rows / 2;
        int hexaHeight = HEIGHT / rows;
        int halfHexaHeight = hexaHeight / 2;
        int xOneAndFive = 0;
        int xTwoAndFour = 0;
        int xThree = 0;
        int xSix = 0;
        int x[] = {xOneAndFive, xTwoAndFour, xThree, xTwoAndFour, xOneAndFive, xSix};
        int yOneAndTwo = 0;
        int yThreeAndSix = 0;
        int yFourAndFive = 0;
        int y[] = {yOneAndTwo, yOneAndTwo, yThreeAndSix, yFourAndFive, yFourAndFive, yThreeAndSix};
        int nPoints = 6;

        for (int i = 0; i< 1; i++) {
            xOneAndFive = halfCanvasWidth - halfHexaWidth;
            xTwoAndFour = halfCanvasWidth + halfHexaWidth;
            xThree = halfCanvasWidth + hexaWidth;
            xSix = halfCanvasWidth - hexaWidth;
            x[0] = xOneAndFive;
            x[1] = xTwoAndFour;
            x[2] = xThree;
            x[3] = xTwoAndFour;
            x[4] = xOneAndFive;
            x[5] = xSix;
            yOneAndTwo = 0;
            yThreeAndSix = halfHexaHeight;
            yFourAndFive = hexaHeight;
            y[0] = yOneAndTwo;
            y[1] = yOneAndTwo;
            y[2] = yThreeAndSix;
            y[3] = yFourAndFive;
            y[4] = yFourAndFive;
            y[5] = yThreeAndSix;
            graphics.drawPolygon(x, y, nPoints);
        }

        for (int i = 0; i< 1; i++) {
            xOneAndFive = halfCanvasWidth - halfHexaWidth;
            xTwoAndFour = halfCanvasWidth + halfHexaWidth;
            xThree = halfCanvasWidth + hexaWidth;
            xSix = halfCanvasWidth - hexaWidth;
            x[0] = xOneAndFive;
            x[1] = xTwoAndFour;
            x[2] = xThree;
            x[3] = xTwoAndFour;
            x[4] = xOneAndFive;
            x[5] = xSix;
            yOneAndTwo = HEIGHT - hexaHeight;
            yThreeAndSix = HEIGHT - halfHexaHeight;
            yFourAndFive = HEIGHT;
            y[0] = yOneAndTwo;
            y[1] = yOneAndTwo;
            y[2] = yThreeAndSix;
            y[3] = yFourAndFive;
            y[4] = yFourAndFive;
            y[5] = yThreeAndSix;
            graphics.drawPolygon(x, y, nPoints);
        }


        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    xOneAndFive = halfCanvasWidth - halfHexaWidth - (i - 2 * j) * (hexaWidth + halfHexaWidth);
                    xTwoAndFour = halfCanvasWidth + halfHexaWidth - (i - 2 * j) * (hexaWidth + halfHexaWidth);
                    xThree = halfCanvasWidth + hexaWidth - (i - 2 * j) * (hexaWidth + halfHexaWidth);
                    xSix = halfCanvasWidth - hexaWidth - (i - 2 * j) * (hexaWidth + halfHexaWidth);
                    x[0] = xOneAndFive;
                    x[1] = xTwoAndFour;
                    x[2] = xThree;
                    x[3] = xTwoAndFour;
                    x[4] = xOneAndFive;
                    x[5] = xSix;
                    yOneAndTwo = i * halfHexaHeight;
                    yThreeAndSix = halfHexaHeight + i * halfHexaHeight;
                    yFourAndFive = hexaHeight + i * halfHexaHeight;
                    y[0] = yOneAndTwo;
                    y[1] = yOneAndTwo;
                    y[2] = yThreeAndSix;
                    y[3] = yFourAndFive;
                    y[4] = yFourAndFive;
                    y[5] = yThreeAndSix;
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
    static int WIDTH = 300;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SuperHexagon.ImagePanel panel = new SuperHexagon.ImagePanel();
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
