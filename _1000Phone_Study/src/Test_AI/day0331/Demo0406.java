package Test_AI.day0331;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 19:27:46
 */
public class Demo0406 {

    //java画图，给定半径画圆形，并标注半径和面积，将回答的结果翻译为中文.// Importing necessary libraries
    public static class Circle extends JPanel {
        // Declaring radius variable
        int radius = 100;

        // Overriding paintComponent method
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Drawing circle with given radius
            g.drawOval(100, 100, radius * 2, radius * 2);
            // Calculating area of circle
            double area = Math.PI * radius * radius;
            // Displaying radius and area of circle
            g.drawString("半径: " + radius, 50, 50);
            g.drawString("面积: " + area, 50, 70);
        }

    }
    public static void main(String[] args) {
        // Creating frame and panel
        JFrame frame = new JFrame();
        Circle circle = new Circle();
        // Setting size of panel
        circle.setPreferredSize(new Dimension(400, 400));
        // Adding panel to frame
        frame.add(circle);
        // Setting frame properties
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
