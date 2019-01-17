package trees;

import java.awt.*;

public class Trees {
    int width = 20;
    int height = 30;
    int x = 450;
    int y = 450;
    int y2 = 900;

    public Trees() {

    }

    public void drawTree(Graphics g, int x, int y, int x2, int y2, int width, int height) {
        if (width  >= 400) {
            return;
        } else {
            g.drawLine(x, y, x2, y2);
           // g.drawLine(x, y - 200, x - height + 100, y - 400);

           // drawTree(g, x - width, y - height, x, y, width + 20 , height - 30);
            drawTree(g, x + width, y + height, x, y, width + 20 , height - 50);
        }
    }

}
