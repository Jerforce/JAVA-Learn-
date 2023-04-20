package javalearn.api.homework;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 19:26
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        for(int i=0; i<99999;i++) {
            if(IsSCanner(str)) {
                break;
            }else{
                System.out.println("重新输入:");
                str = sc.next();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            int num = c - 48;
            //字节转数字

            String RomoString = toStringRomanian(num);
            sb.append(RomoString);
        }
        System.out.println(sb.toString());
    }

    public static boolean IsSCanner(String str){
      if(str.length()<=9&&str.matches("\\d+")) {
          return true;
      } else{
              return false;
          }


    }

    public static String toStringRomanian(int num) {

        String[]Arr={" ","I","II","III","IV","V","VI","VII","VIII","IX"};
        //0~9
      return Arr[num];
    }

}

