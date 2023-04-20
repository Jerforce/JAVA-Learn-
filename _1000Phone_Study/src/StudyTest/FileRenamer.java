package StudyTest;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Jerforce
 * @date 2023/4/14 星期五 21:42:03
 */


public class FileRenamer {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Desktop\\1000phones - 副本");
        File[] files = folder.listFiles();

        //按文件修改时间排序
        Arrays.sort(files, Comparator.comparingLong(File::lastModified));
       //遍历输出files
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        //遍历文件并重命名
        int count = 1;
        String prefix = "day";
        String lastPrefix = "";
        for (File file : files) {
            String fileName = file.getName();
            String newFileName;
            if (lastPrefix.equals(fileName.substring(0, 2))) {
                newFileName = prefix + count + "_" + fileName;
                count++;
            } else {
                lastPrefix = fileName.substring(0, 2);
                count = 1;
                newFileName = prefix + count + "_" + fileName;
                count++;
            }
            file.renameTo(new File(folder.getAbsolutePath() + "/" + newFileName));
        }
    }
}
