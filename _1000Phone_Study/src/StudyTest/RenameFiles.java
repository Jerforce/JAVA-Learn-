package StudyTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jerforce
 * @date 2023/4/14 星期五 20:47:05
 */


public class RenameFiles {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Desktop\\1000phones"); // 替换为实际文件夹路径
        File[] files = folder.listFiles();
        List<File> needRenameFiles = new ArrayList<>();
        Map<String, List<File>> groupFilesMap = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
                String nameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
                String[] nameParts = nameWithoutExt.split("[(（]");
                String namePrefix = nameParts[0];
                String modifiedFileName;
                if (nameParts.length > 1) {
                    String nameIndex = nameParts[1].replaceAll("[)）]", "");
                    if (nameIndex.matches("\\d+")) {
                        modifiedFileName = namePrefix + "_" + nameIndex + "." + fileExt;
                    } else {
                        modifiedFileName = nameWithoutExt + "." + fileExt;
                    }
                } else {
                    modifiedFileName = nameWithoutExt + "." + fileExt;
                }
                Matcher matcher = Pattern.compile("day\\d{2}_.*").matcher(modifiedFileName);
                if (!matcher.matches()) {
                    groupFilesMap.computeIfAbsent(namePrefix, k -> new ArrayList<>()).add(file);
                } else {
                    needRenameFiles.add(file);
                }
            }
        }
        List<String> namePrefixList = new ArrayList<>(groupFilesMap.keySet());
        Collections.sort(namePrefixList);
        int dayCount = 1;
        for (String namePrefix : namePrefixList) {
            List<File> filesToRename = groupFilesMap.get(namePrefix);
            Collections.sort(filesToRename, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    return o1.lastModified() > o2.lastModified() ? 1 : -1;
                }
            });
            for (File file : filesToRename) {
                String oldName = file.getName();
                String newName = "day" + String.format("%02d", dayCount) + "_" + oldName;
                File newFile = new File(file.getParentFile(), newName);
                try {
                    if (file.renameTo(newFile)) {
                        System.out.println(sdf.format(new Date()) + " 文件重命名成功： " + oldName + " -> " + newName);
                    } else {
                        System.out.println(sdf.format(new Date()) + " 文件重命名失败： " + oldName);
                    }
                } catch (Exception e) {
                    System.out.println(sdf.format(new Date()) + " 文件重命名出错： " + oldName);
                    e.printStackTrace();
                }
            }
            dayCount++;
        }
        for (File file : needRenameFiles) {
            String oldName = file.getName();
            String newName = oldName.replaceFirst("day\\d{2}_", "");
            String[] nameParts = newName.split("\\.");
            String nameWithoutExt = nameParts[0];
            String fileExt = nameParts[1];
            String[] namePrefixParts = nameWithoutExt.split("_");
            String namePrefix = namePrefixParts[0];
            String nameIndex = namePrefixParts[1];
            List<File> samePrefixFiles = groupFilesMap.get(namePrefix);
            boolean needIndex = false;
            for (File f : samePrefixFiles) {
                if (f != file && f.getName().startsWith(namePrefix + "_")) {
                    needIndex = true;
                    break;
                }
            }
            if (needIndex) {
                int count = 1;
                while (true) {
                    String indexStr = String.format("(%d)", count);
                    String tempNewName = namePrefix + indexStr + "." + fileExt;
                    File tempFile = new File(file.getParentFile(), tempNewName);
                    if (!tempFile.exists()) {
                        newName = tempNewName;
                        break;
                    }
                    count++;
                }
            } else {
                newName = namePrefix + "." + fileExt;
            }
            File newFile = new File(file.getParentFile(), newName);
            try {
                if (file.renameTo(newFile)) {
                    System.out.println(sdf.format(new Date()) + " 文件重命名成功： " + oldName + " -> " + newName);
                } else {
                    System.out.println(sdf.format(new Date()) + " 文件重命名失败： " + oldName);
                }
            } catch (Exception e) {
                System.out.println(sdf.format(new Date()) + " 文件重命名出错： " + oldName);
                e.printStackTrace();
            }
        }
    }
}

