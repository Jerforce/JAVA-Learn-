package javalearn.exam.today;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 20:14
 **/
public class Test {
    public static boolean login(String username, String password){
        if(username.equals("admin") && password.equals("123456")){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        if(login(username,password)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
