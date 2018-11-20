package triangles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestPane extends JPanel {

    private int count = 0;

    public TestPane() {
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count == 7) {
                    ((Timer)e.getSource()).stop();
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
    public Dimension getPreferredSize() {
        return new Dimension((120 * 7) + 100, 300);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        super.paintComponent(g);
        int x = 100;
        for (int rect = 1; rect <= count; rect++) {
            g2d.drawRect(x, 100, 100, 100);
            x += 120;
            g.drawLine(x, 100, 100, 200);
            //timer delay
        }


        g2d.dispose();
    }
}
