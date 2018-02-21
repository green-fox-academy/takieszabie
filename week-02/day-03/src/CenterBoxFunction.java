// create a square drawing function that takes 1 parameter:
// the square size
// and draws a square of that size to the center of the canvas.
// draw 3 squares with that function.
// avoid code duplication.

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        int squareSizing = 50;
        drawsquare(squareSizing, graphics);
    }

    private static void drawsquare(int size, Graphics graphics) {
        for (int i = 1; i < 4; i++) {
            int adjSize = size*i;
            int positionX = (WIDTH / 2 - adjSize/2);
            int positionY = (HEIGHT / 2 - adjSize/2);
            graphics.setColor(Color.GREEN);
            graphics.drawRect(positionX, positionY, adjSize, adjSize);
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