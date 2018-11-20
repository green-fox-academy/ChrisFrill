package triangles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Test {

    public static int count = 0;
    static int WIDTH = 900;
    static int HEIGHT = 900;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static Point middle = new Point(screenSize.width / 2 , screenSize.height / 2 );
    static JFrame jFrame = new JFrame("Drawing");

    public static void main(String[] args) {
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        TestPane panel = new TestPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setVisible(true);
        jFrame.pack();
        Point newLocation = new Point(middle.x - (jFrame.getWidth() / 2),
                middle.y - (jFrame.getHeight() / 2));
        jFrame.setLocation(newLocation);
    }

    private static void mainDraw(Graphics g) {
        Test test = new Test();
        test.drawTriangleFractal(g, 0, 0, 900);
    }

    public void drawTriangleFractal(Graphics g, int x, int y, int size) {
        if (size <= 0) {
            return;
        } else {

            for (int rect = 1; rect <= count; rect++) {
                g.drawLine(x, y, x + size / 2, y + size);
                g.drawLine(x + size, y, x + size / 2, y + size);
                g.drawLine(x, y, x + size, y);
            }
            g.dispose();

            drawTriangleFractal(g, x, y, size / 2);
            drawTriangleFractal(g, x + size / 2, y, size / 2);
            drawTriangleFractal(g, x + size / 4, y + size / 2, size / 2);

        }

    }

    public Test() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {


            }
        });
    }

    public static class TestPane extends JPanel {


        public TestPane() {
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    if (count == 7) {
                        ((Timer) e.getSource()).stop();
                    }
                    repaint();
                }
            });
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    timer.stop();
                    count = 0;
                    timer.start();
                }
            });
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            mainDraw(g);
        }
    }
}