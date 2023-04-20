package javalearn.api.demostring.string;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 16:38
 **/
public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = sc.nextInt();
        while (true) {
            if (money >= 0 && money < 9999999) {
                break;
            } else {
                //  System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            money = money / 10;
            // System.out.println(ge);
            String CapticalNumber = getCapiticalNumber(ge);
            moneyStr = CapticalNumber + moneyStr;
            if (money == 0) {
                break;
            }
        }
            int count = 7 - moneyStr.length();
            for (int i = 0; i < count; i++) {
                moneyStr = "零" + moneyStr;
            }
     //   System.out.println(moneyStr);
        //百 十 万 千 百 十 元
        String result = "";
        String []arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }


        public static String getCapiticalNumber ( int number){
            String[] prices = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
            return prices[number];
        }
    }



