package javalearn.homework.day10.object;

/**
 * @author Lenovo
 * @create 2023/3/28 22:46
 **/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TenDaysLater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期（格式为yyyy/MM/dd hh:mm）：");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(input);
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 10);
            String formattedTime = sdf.format(calendar.getTime());
            System.out.println("10天后的日期为：" + formattedTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

