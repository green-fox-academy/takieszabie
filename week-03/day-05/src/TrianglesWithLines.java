import javax.swing.*;
import java.awt.*;
import static java.awt.Color.yellow;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesWithLines {

  public static void mainDraw(Graphics graphics) {

    double count = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = WIDTH;
    int y2 = 0;
    int x3 = WIDTH/2;
    int y3 = HEIGHT;
    triangles(count, x1, y1, x2, y2, x3, y3, graphics);
  }

  private static void triangles(double count, int x1, int y1, int x2, int y2, int x3, int y3, Graphics graphics) {
    if (count==0) {
      return;
    }
    graphics.drawLine(x1, y1, x2, y2);
    graphics.drawLine(x1, y1, x3, y3);
    graphics.drawLine(x3, y3, x2, y2);
    count--;
    triangles(count, (x1+x2)/2, (y1+y2)/2, x2, y2, (x3+x2)/2, (y3+y2)/2, graphics);
    triangles(count, (x1+x2)/2, (y1+y2)/2, (x3+x1)/2, (y3+y1)/2, x3, y3, graphics);

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