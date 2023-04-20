package Test_AI.day0331;
// We need to import the necessary libraries for drawing graphics

import javax.swing.*;
import java.awt.*;
/**
 * @author Lenovo
 * @create 2023/3/31 10:47
 **/
    public class Test2 {
    public static void main(String[] args) {
        // We create a new JFrame object to hold our graphics
        JFrame frame = new JFrame("3D Coordinate System");
        // We set the size of the JFrame
        frame.setSize(800, 600);
        // We set the default close operation of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // We create a new JPanel object to hold our graphics
        JPanel panel = new JPanel() {
            // We override the paintComponent method to draw our graphics
            @Override
            public void paintComponent(Graphics g) {
                // We call the paintComponent method of the super class
                super.paintComponent(g);
                // We set the color of the graphics object to black
                g.setColor(Color.BLACK);
                // We draw the x-axis
                g.drawLine(400, 300, 700, 300);
                // We draw the y-axis
                g.drawLine(400, 300, 100, 100);
                // We draw the z-axis
                g.drawLine(400, 300, 400, 500);
                // We set the color of the graphics object to red
                g.setColor(Color.RED);
                // We draw a point at (500, 400, 200)
                g.fillOval(500, 400, 5, 5);
            }
        };
        // We add the JPanel to the JFrame
        frame.add(panel);
        // We set the JFrame to be visible
        frame.setVisible(true);
    }
}
