package Test_AI.day0331;
import java.io.File;
/**
 * @author Lenovo
 * @create 2023/3/31 11:03
 **/
public class Test4 {
        public static void main(String[] args) {
            // Get the path to the desktop directory
            String desktopPath = System.getProperty("user.home") + "/Desktop";
            File desktopDir = new File(desktopPath);

            // Get a list of all files in the desktop directory
            File[] files = desktopDir.listFiles();

            // Create arrays to store the names and types of the files
            String[] names = new String[files.length];
            String[] types = new String[files.length];

            // Loop through the files and store their names and types in the arrays
            for (int i = 0; i < files.length; i++) {
                names[i] = files[i].getName();
                types[i] = files[i].isDirectory() ? "Directory" : "File";
            }

            // Print out the number of files on the desktop and their names and types
            System.out.println("There are " + files.length + " files on the desktop:");
            for (int i = 0; i < files.length; i++) {
                System.out.println(names[i] + " (" + types[i] + ")");
            }
        }
    }


