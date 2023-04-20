import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jerforce
 * @date 2023/4/20 星期四 08:55:54
 */
public class MethodFolderDelete {
    public static void deleteFolder(File folder) {
        Queue<File> queue = new LinkedList<>();
        queue.add(folder);
        while (!queue.isEmpty()) {
            File dir = queue.remove();
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    queue.add(file);
                } else {
                    file.delete();
                }
            }
            dir.delete();
        }
    }
    public static void main(String[] args) {
        File folder = new File("d://folder");
        deleteFolder(folder);
    }
}
