package Test_AI.day0331;
// Importing necessary libraries

import javax.swing.*;
import java.awt.*;
/**
 * @author Lenovo
 * @create 2023/3/31 10:53
 **/
public class Test3 {

    // Creating a class named MobiusStrip
    public static class MobiusStrip extends JPanel {
        // Defining the dimensions of the frame
        private static final int WIDTH = 800;
        private static final int HEIGHT = 600;

        // Defining the number of twists in the Mobius strip
        private static final int TWISTS = 3;

        // Defining the number of points to be plotted
        private static final int POINTS = 1000;

        // Defining the colors of the Mobius strip
        private static final Color COLOR1 = Color.RED;
        private static final Color COLOR2 = Color.BLUE;

        // Defining the method to draw the Mobius strip
        public void paint(Graphics g) {
            // Setting the background color of the frame
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, WIDTH, HEIGHT);

            // Setting the color of the Mobius strip
            g.setColor(COLOR1);

            // Creating variables to store the coordinates of the points to be plotted
            int x1, y1, x2, y2;

            // Looping through the number of points to be plotted
            for (int i = 0; i < POINTS; i++) {
                // Calculating the coordinates of the points to be plotted
                double t = (double) i / (double) POINTS;
                double phi = t * 2 * Math.PI * TWISTS;
                double x = Math.cos(phi);
                double y = Math.sin(phi);
                double w = 0.25 * phi;
                x += w * Math.cos(phi / 2);
                y += w * Math.sin(phi / 2);

                // Scaling the coordinates of the points to fit the frame
                x1 = (int) (x * WIDTH / 4 + WIDTH / 2);
                y1 = (int) (y * HEIGHT / 4 + HEIGHT / 2);

                // Calculating the coordinates of the second point to be plotted
                x2 = (int) (-x * WIDTH / 4 + WIDTH / 2);
                y2 = (int) (-y * HEIGHT / 4 + HEIGHT / 2);

                // Setting the color of the second point to be plotted
                g.setColor(COLOR2); // Setting the color of the second point to be plotted
                g.drawLine(x1, y1, x2, y2); // Drawing a line between the two points
                g.setColor(COLOR1); // Setting the color of the next point to be plotted
            }
            g.setColor(COLOR2); // Setting the color of the next point to be plotted
            g.drawString("Mobius Strip", WIDTH / 2 - 40, HEIGHT / 2); // Adding a title to the frame
        }

        // Defining the main method
        public static void main(String[] args) {
            // Creating a new frame
            JFrame frame = new JFrame("Mobius Strip");

            // Setting the dimensions of the frame
            frame.setSize(WIDTH, HEIGHT);

            // Adding the Mobius strip to the frame
            frame.add(new MobiusStrip());

            // Setting the default close operation of the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Making the frame visible
            frame.setVisible(true);
        }
    }



}

