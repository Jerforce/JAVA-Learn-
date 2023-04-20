package Test_AI.day0331;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 20:50:12
 */
    public class CountdownAnimation extends JPanel {
    private int timeLeft = 60;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("Arial", Font.BOLD, 48));
        g2.drawString(Integer.toString(timeLeft), getWidth() / 2 - 12, getHeight() / 2 + 18);
    }

    public void decrementTimeLeft() {
        timeLeft--;
        repaint();
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Countdown Animation");
        CountdownAnimation countdownAnimation = new CountdownAnimation();
        frame.add(countdownAnimation);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 60; i++) {
            countdownAnimation.decrementTimeLeft();
            Thread.sleep(1000);
        }
    }
}




