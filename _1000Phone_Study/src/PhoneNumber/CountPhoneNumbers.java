package PhoneNumber;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Jerforce
 * @date 2023/4/12 星期三 20:58:14
 */


public class CountPhoneNumbers {
    public static void main(String[] args) {
        try {
            // 读取文件
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.home") + "/Desktop/phone-number.txt"));
            String line;
            List<String> phoneNumbers = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                phoneNumbers.addAll(Arrays.asList(line.split(",")));
            }
            reader.close();

            // 统计每个号码出现的次数
            Map<String, Integer> counts = new HashMap<>();
            for (String phoneNumber : phoneNumbers) {
                counts.put(phoneNumber, counts.getOrDefault(phoneNumber, 0) + 1);
            }

            // 输出到 Excel 文件
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Phone Numbers");
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Phone Number");
            headerRow.createCell(1).setCellValue("Count");
            int rownum = 1;
            for (String phoneNumber : counts.keySet()) {
                Row row = sheet.createRow(rownum++);
                row.createCell(0).setCellValue(phoneNumber);
                row.createCell(1).setCellValue(counts.get(phoneNumber));
            }
            FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.home") + "/Desktop/phone_counts.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


