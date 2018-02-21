// create a square drawing function that takes 2 parameters:
// the x and y coordinates of the square's top left corner
// and draws a 50x50 square from that point.
// draw 3 squares with that function.
// avoid code duplication.

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        int spacing = 0;
        int startX = 100;
        int startY = 100;
        int numberOfRectangles = 3;

        drawrectangles(startX, startY, spacing, numberOfRectangles, graphics);
    }

    private static void drawrectangles(int pointX, int pointY, int s, int nR, Graphics graphics) {
        for (int i = 0; i < nR; i++) {
            Random randomNumber = new Random();
            int rectPosition = randomNumber.nextInt(100);
            int r = randomNumber.nextInt(240);
            int g = randomNumber.nextInt(240);
            int b = randomNumber.nextInt(240);
            Color randomColor = new Color(r,g,b);
            graphics.setColor(randomColor);
            graphics.drawRect(pointX-rectPosition, pointY-rectPosition, 50, 50);
        }


    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}