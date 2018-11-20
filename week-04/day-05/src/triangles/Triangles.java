package triangles;

import java.awt.*;

public class Triangles {

    public Triangles() {
    }

    public static void main(String[] args) {

    }

    public void drawTriangleFractal(Graphics g, int x, int y, int size) {
        if (size <= 0) {
            return;
        } else {
            g.drawLine(x, y, x + size / 2, y + size);
            g.drawLine(x + size, y, x + size / 2, y + size);
            g.drawLine(x, y, x + size, y);

            g.setColor(Color.GREEN);
            drawTriangleFractal(g, x, y, size / 2);
            g.setColor(Color.RED);
            drawTriangleFractal(g, x + size / 2, y, size / 2);
            g.setColor(Color.BLUE);
            drawTriangleFractal(g, x + size / 4, y + size / 2, size / 2);

        }

    }
}
