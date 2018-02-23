import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int min = 1;
        int max = 20;

        int x = 10;
        int y = 10;
        int i = 17;

        drawlineOne(x,y, graphics, i);
        drawlineTwo(x,y,graphics,i);
        drawlineThree(x,y,graphics,i);
        drawlineFour(x,y,graphics,i);
    }

    private static void drawlineFour(int x, int y, Graphics graphics, int i) {
        graphics.setColor(Color.GREEN);
        for (int j = 0; j < i; j++) {
            graphics.drawLine(WIDTH/2-j*x, HEIGHT/2, WIDTH/2, HEIGHT-j*y);
        }
    }

    private static void drawlineThree(int x, int y, Graphics graphics, int i) {
        graphics.setColor(Color.GREEN);
        for (int j = 0; j < i; j++) {
            graphics.drawLine(WIDTH/2+j*x, HEIGHT/2, WIDTH/2, HEIGHT-j*y);
        }
    }

    private static void drawlineTwo(int x, int y, Graphics graphics, int i) {
        graphics.setColor(Color.GREEN);
        for (int j = 0; j < i; j++) {
            graphics.drawLine(WIDTH/2, 0+j*y, WIDTH/2+j*x, HEIGHT/2);
        }
    }

    private static void drawlineOne(int x, int y, Graphics graphics, int i) {
        for (int j = 0; j < i ; j++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2, 0+j*y, WIDTH/2-j*x, HEIGHT/2);
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