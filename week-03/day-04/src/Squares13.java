import javax.swing.*;

import java.awt.*;

import static java.awt.Color.yellow;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares13 {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    graphics.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT);
    graphics.drawLine(2*WIDTH/3, 0, 2*WIDTH/3, HEIGHT);
    graphics.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT);
    graphics.drawLine(2*WIDTH/3, 0, 2*WIDTH/3, HEIGHT);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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