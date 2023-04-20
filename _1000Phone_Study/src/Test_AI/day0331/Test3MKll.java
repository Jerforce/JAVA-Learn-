package Test_AI.day0331;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * @author Jerforce
 * @date 2023/4/15 星期六 17:19:55
 */
public class Test3MKll {

    public static class MobiusStrip extends JPanel {
        private static final int WIDTH = 800;
        private static final int HEIGHT = 600;

        private int twists;   // 使扭曲次数成为输入参数
        private int points;   // 使点数成为输入参数

        private double twistX; // 存储上一次鼠标拖动产生的扭曲
        private double twistY;

        private Random random = new Random();

        public MobiusStrip(int twists, int points) {
            this.twists = twists;
            this.points = points;

            addMouseListener(new MouseAdapter() {
                public void mouseDragged(MouseEvent e) {
                    // 产生随机的扭曲
                    twistX += random.nextDouble() * 0.5 - 0.25;
                    twistY += random.nextDouble() * 0.5 - 0.25;
                    repaint(); // 重绘产生新的扭曲
                }
            });
        }

        public void paint(Graphics g) {
            // 绘制三角形面片代替线段
            int[] xPoints = new int[3];
            int[] yPoints = new int[3];

            for (int i = 0; i < points; i++) {
                // 添加扭曲
                double t = (double) i / (double) points;
                double phi = t * 2 * Math.PI * twists + twistX;
                double theta = t * Math.PI + twistY;

                double x = Math.sin(theta) * Math.cos(phi);
                double y = Math.sin(theta) * Math.sin(phi);
                double z = Math.cos(theta);

                // 添加光照效果
                double lighting = Math.sin(i * 0.1);

                xPoints[0] = (int) (x * WIDTH * lighting / 4 + WIDTH / 2);
                yPoints[0] = (int) (y * HEIGHT * lighting / 4 + HEIGHT / 2);

                // 绘制三角形面片
                g.fillPolygon(xPoints, yPoints, 3);
            }

            g.setColor(Color.BLUE);
            g.drawString("Mobius Strip", WIDTH / 2 - 40, HEIGHT / 2);
        }

        public static void main(String[] args) {


            JFrame frame = new JFrame("Mobius Strip");
            frame.setSize(WIDTH, HEIGHT);
            frame.add(new MobiusStrip(3, 5000));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}