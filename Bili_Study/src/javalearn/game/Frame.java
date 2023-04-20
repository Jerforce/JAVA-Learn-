package javalearn.game;

import javax.swing.*;

/**
 * @author Lenovo
 * @create 2023/3/28 16:11
 **/
public class Frame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(400, 400);

        jFrame.setLocationRelativeTo(null);

        jFrame.setAlwaysOnTop(true);

        jFrame.setDefaultCloseOperation(3);

        jFrame.setTitle("Java Game Demo 1.0");

        jFrame.setVisible(true);


        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setSize(400, 40);
        JMenu jMenu = new JMenu("File");
        JMenuItem jMenuItem = new JMenuItem("New");
        jMenu.add(jMenuItem);
        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);
    }

    public class LoginFrame extends JFrame {
        public LoginFrame() {
            setTitle("Login");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(3);
            setAlwaysOnTop(true);
            setResizable(false);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            this.setVisible(true);
        }
        public class RegisterFrame extends JFrame {
            public RegisterFrame() {
                setTitle("Register");
                setSize(300, 200);
                this.setLocationRelativeTo(null);
                setResizable(false);
                this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.setLayout(null);
                this.setVisible(true);


            }
        }
    }
}
