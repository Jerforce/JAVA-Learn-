package Test_AI.day0331;

import javax.swing.*;
import java.io.File;
public class demo1 {
    // Import necessary packages
        public static void main(String[] args) {
            // Create a file chooser
            JFileChooser fileChooser = new JFileChooser();

            // Show the file chooser dialog and get the user's selection
            int result = fileChooser.showOpenDialog(null);

            // If the user selects a file, display a message with the file path
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "You selected: " + file.getAbsolutePath());

                // Create a file object for the selected directory
                File directory = new File(file.getParent());

                // Get a list of all files in the directory
                File[] files = directory.listFiles();

                // Loop through the files and display their names
                for (File f : files) {
                    JOptionPane.showMessageDialog(null, f.getName());
                }
            }
        }
}
