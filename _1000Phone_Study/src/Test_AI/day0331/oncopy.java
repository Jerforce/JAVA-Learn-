package Test_AI.day0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 20:41:42
 */
public class oncopy {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://baike.baidu.com/item/Java%20%E7%BC%96%E7%A8%8B%E8%AF%AD%E8%A8%80/10263609?fromid=85979&fromtitle=Java");

        // 打开连接
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

// 设置请求方式为"GET"
        conn.setRequestMethod("GET");

        // 获取输入流
        InputStream is = conn.getInputStream();

        // 将字节流转换为字符流
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");

        // 创建字符缓冲流
        BufferedReader br = new BufferedReader(isr);

        // 创建字符串缓冲区
        StringBuffer sb = new StringBuffer();

        // 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

// 关闭流
        br.close();
        isr.close();
        is.close();

        // 将网页内容转换为字符串
        String html = sb.toString();



        // 匹配文件大小
        Pattern sizePattern = Pattern.compile("文件大小</dt><dd class=\"basicInfo-item value\">(.*?)</dd>");
        Matcher sizeMatcher = sizePattern.matcher(html);
        String fileSize = "";
        if (sizeMatcher.find()) {
            fileSize = sizeMatcher.group(1);
        }

        // 匹配文件格式名称
        Pattern formatPattern = Pattern.compile("文件格式名称</dt><dd class=\"basicInfo-item value\">(.*?)</dd>");
        Matcher formatMatcher = formatPattern.matcher(html);
        String formatName = "";
        if (formatMatcher.find()) {
            formatName = formatMatcher.group(1);
        }

        // 将文件大小和文件格式名称存入集合中
        List<String> infoList = new ArrayList<>();
        infoList.add(fileSize);
        infoList.add(formatName);// 根据输入的文件格式名称输出文件信息
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入文件格式名称：");
        String inputFormatName = scanner.nextLine();
        if (inputFormatName.equals(formatName)) {
            System.out.println("文件大小：" + fileSize);
            System.out.println("文件格式名称：" + formatName);
        } else {
            System.out.println("未找到该文件格式的信息");
        }

        System.out.println("文件大小：" + fileSize);
        System.out.println("文件格式名称：" + formatName);
    }
}
