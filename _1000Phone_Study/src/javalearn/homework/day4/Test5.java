package javalearn.homework.day4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 19:20
 **/
public class Test5 {
    public static void login(String username, String password){
        String userName = "admin";
        String passWord = String.valueOf(123456);
        if(userName.equals(username) &&passWord.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

    }
    public static void main(String[] args) {
       // login("admin","123456");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input username:");
        String username = scanner.next();
        System.out.println("input password:");
        String password = scanner.next();
        login(username,password);
    }

}
