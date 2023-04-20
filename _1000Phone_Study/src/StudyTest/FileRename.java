package StudyTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Jerforce
 * @date 2023/4/14 星期五 21:51:12
 */

public class FileRename {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Desktop\\1000phones");
        File[] files = folder.listFiles();
        Arrays.sort(files, (f1, f2) -> Long.compare(f1.lastModified(), f2.lastModified()));

        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        int day = Integer.parseInt(sdf.format(new Date()));

        Map<String, Integer> nameMap = new HashMap<>(); // 存储文件名前两个汉字相同的文件数量
        for (File file : files) {
            String oldName = file.getName();
            String prefix = oldName.substring(0, 2); // 获取文件名前两个汉字
            if (nameMap.containsKey(prefix)) {
                String newName = oldName; // 不需要增加 day（数字）_ 前缀
                File newFile = new File(folder.getPath() + "\\" + newName);
                file.renameTo(newFile);
            } else {
                int count = nameMap.size() + 1;// 获取已有的同名文件数量，如果没有则默认为0
                String newName = "day" + String.format("%02d", count) + "_" + oldName;
                File newFile = new File(folder.getPath() + "\\" + newName);
                file.renameTo(newFile);
                nameMap.put(prefix, count); // 更新同名文件数量
            }
        }
    }
}
