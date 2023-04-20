package PhoneNumber;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jerforce
 * @date 2023/4/12 星期三 19:59:57
 */

public class RandomPhones {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] phoneNumber = new String[99999999];
        int count = 0; // 计数器
        double duplicateWeight = 0.9; // 设置重复号码的权重
        Set<String> generatedNumbers = new HashSet<>();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/phone-number.txt"));
            for (int i = 0; i < 99999999; i++) {
                String prefix = "1" + rand.nextInt(10);
                String suffix = String.format("%08d", rand.nextInt(1000000000));
                String number = prefix + suffix;
                if (isPhone(number) && (!generatedNumbers.contains(number) || rand.nextDouble() > duplicateWeight)) {
                    phoneNumber[i] = number;
                    writer.write(phoneNumber[i] + ",");
                    generatedNumbers.add(number);
                    count++;
                    if (count == 20) { // 输出20个号码后换行
                        writer.newLine();
                        count = 0; // 重置计数器
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPhone(String Phone_number){
        String regex ="^((13[0-9])|(14(0|[5-7]|9))|(15([0-3]|[5-9]))|(16(2|[5-7]))|(17[0-8])|(18[0-9])|(19([0-3]|[5-9])))\\d{8}$";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(Phone_number);
        return m.matches();
    }
}
