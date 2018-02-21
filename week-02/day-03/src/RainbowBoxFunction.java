// Create a square drawing function that takes 2 parameters:
// The square size, and the fill color,
// and draws a square of that size and color to the center of the canvas.
// Create a loop that fills the canvas with rainbow colored squares.

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        int squareSizePixel = 10;
        drawsquaresall(squareSizePixel, graphics);
    }

    public static void drawsquaresall(int size, Graphics graphics){
        int numberInRow = WIDTH/size;
        int numberInColumn = HEIGHT/size;
        for (int i = 0; i < numberInColumn; i++) {
            for (int j = 0; j < numberInRow; j++) {
                Random randomColor = new Random();
                int r = randomColor.nextInt(240);
                int g = randomColor.nextInt(240);
                int b = randomColor.nextInt(240);
                Color defineColor = new Color(r,g,b);

                graphics.setColor(defineColor);
                graphics.fillRect(0+i*size,0+j*size, size, size);
            }
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