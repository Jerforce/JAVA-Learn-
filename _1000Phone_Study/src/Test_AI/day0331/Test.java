package Test_AI.day0331; /**
 * @author Lenovo
 * @create 2023/3/31 10:40
 **/
// Importing necessary libraries

import javax.swing.*;
import java.awt.*;
public class Test {
    public static class Flower extends JPanel {

        // Overriding the paintComponent method
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Setting the background color
            setBackground(Color.WHITE);

            // Setting the color of the flower
            g.setColor(Color.RED);

            // Drawing the petals of the flower
            g.fillOval(50, 50, 50, 50);
            g.fillOval(80, 80, 50, 50);
            g.fillOval(50, 110, 50, 50);
            g.fillOval(20, 80, 50, 50);

            // Drawing the center of the flower
            g.setColor(Color.YELLOW);
            g.fillOval(60, 80, 30, 30);
        }

        // Creating the main method
        public static void main(String[] args) {

            // Creating a new JFrame object
            JFrame frame = new JFrame();

            // Setting the size of the JFrame
            frame.setSize(200, 200);

            // Adding the Flower object to the JFrame
            frame.add(new Flower());

            // Setting the default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Making the JFrame visible
            frame.setVisible(true);
        }
    }

}