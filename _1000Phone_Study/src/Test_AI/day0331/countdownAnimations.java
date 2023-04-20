package Test_AI.day0331;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 20:52:10
 */
    public class countdownAnimations extends JPanel {
    private int hours;
    private int minutes;
    private int seconds;

    public countdownAnimations(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the countdown using the specified format (00:00:00)
        g.drawString(String.format("%02d:%02d:%02d", hours, minutes, seconds), 100, 100);
    }

    public void startCountdown() {
        // start the countdown by decrementing the time every second
        while (hours > 0 || minutes > 0 || seconds > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (seconds == 0) {
                if (minutes == 0) {
                    hours--;
                    minutes = 59;
                    seconds = 59;
                } else {
                    minutes--;
                    seconds = 59;
                }
            } else {
                seconds--;
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        // create a new CountdownAnimation object with the specified time
        countdownAnimations countdown = new countdownAnimations(0, 1, 30);

        // create a new JFrame and add the CountdownAnimation object to it
        JFrame frame = new JFrame("Countdown Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(countdown);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // start the countdown
        countdown.startCountdown();

















    }
}
