// Create a line drawing function that takes 2 parameters:
// The x and y coordinates of the line's starting point
// and draws a 50 long horizontal line from that point.
// Draw 3 lines with that function. Use loop for that.

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void mainDraw(Graphics graphics) {

        int startX = 200;
        int startY = 100;
        int numberOfRounds = 3;

        drawline(startX, startY, numberOfRounds, graphics);

    }

    private static void drawline(int pointX, int pointY, int rounds, Graphics graphics) {
        for (int i = 0; i < rounds; i++) {
            graphics.setColor(Color.RED);
            graphics.drawLine(pointX, pointY+10*i, (pointX+50), pointY+10*i);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}