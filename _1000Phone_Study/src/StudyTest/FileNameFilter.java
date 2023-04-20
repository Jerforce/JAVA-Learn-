package StudyTest;

/**
 * @author Jerforce
 * @date 2023/4/14 星期五 20:12:55
 */


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameFilter {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Desktop\\1000phones"); // 替换为实际文件夹路径
        File[] files = folder.listFiles();
        List<File> needRenameFiles = new ArrayList<>();
        Pattern pattern = Pattern.compile("day\\d{2}_.*");
        for (File file : files) {
            if (file.isFile()) {
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.matches()) {
                    needRenameFiles.add(file);
                }
            }
        }
        for (File file : needRenameFiles) {
            String oldName = file.getName();
            String newName = oldName.replaceFirst("day\\d{2}_", "");
            File newFile = new File(file.getParentFile(), newName);
            try {
                if (file.renameTo(newFile)) {
                    System.out.println("文件重命名还原成功： " + oldName + " -> " + newName);
                } else {
                    System.out.println("文件重命名还原失败： " + oldName);
                }
            } catch (Exception e) {
                System.out.println("文件还原出错： " + oldName);
                e.printStackTrace();
            }
        }
    }

}
