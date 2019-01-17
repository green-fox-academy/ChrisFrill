import triangles.Triangles;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class FractalTree1 extends Canvas {

    // fields for drawing
    private JFrame frame;
    private final int WINDOW_WIDTH = 1280;
    private final int WINDOW_HEIGHT = 720;

    public FractalTree1() {
        frame = new JFrame("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.add(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FractalTree1 ft = new FractalTree1();
        ft.setVisible(true);
        ft.setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        Triangles triangles = new Triangles();
        triangles.drawTriangleFractal(g, 0, 0, 900);
    }

    public void drawTriangleFractal(Graphics g, int x, int y, int size) {
        if (size <= 0) {
        } else {

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,     RenderingHints.VALUE_ANTIALIAS_ON);

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