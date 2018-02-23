import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int min = 1;
        int max = 20;

        int x = 30;
        int y = 30;
        int i = 10;

        drawlineOne(x,y, graphics, i);
        drawlineTwo(x,y,graphics,i);
    }

    private static void drawlineTwo(int x, int y, Graphics graphics, int i) {
        graphics.setColor(Color.GREEN);
        for (int j = 0; j < i; j++) {
            graphics.drawLine(0, y+j*y, x+j*x, HEIGHT);
        }
    }

    private static void drawlineOne(int x, int y, Graphics graphics, int i) {
        for (int j = 0; j < i ; j++) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(x+j*x, 0, WIDTH, y+j*y);
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