package javalearn.homework.day10.object;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/28 21:24
 **/
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailName;
        String password;
        do {
            System.out.println("请输入邮箱：");
            emailName = sc.next();
        } while (!Checkemail(emailName));

        System.out.println("请输入密码：");
        password = sc.next();
        while (password.length() < 6) {
            System.out.println("密码长度不能小于6位");
            System.out.println("请重新输入密码：");
            password = sc.next();
        }

        if (emailName.equals("zhangsan@163.com") && password.equals("666666")) {
            System.out.println("登录成功");
            String username = emailName.substring(0, emailName.indexOf("@"));
            System.out.println("欢迎, " + username);
        }else {
            System.out.println("登录失败");
        }
    }

    public static Boolean Checkemail(String emailName) {
        if (emailName == null || emailName.isEmpty()) {
            System.out.println("邮箱不能为空");
            return false;
        }
        if (emailName.indexOf("@") < 0 || emailName.indexOf(".") < 0 || emailName.indexOf("@") > emailName.indexOf(".")) {

            System.out.println("邮箱格式不正确");
            return false;
        }
        if(!emailName.equals("zhangsan@163.com")){
                System.out.println("用户邮箱不符合");
                return false;
        } else {
            return true;
        }
    }

}



