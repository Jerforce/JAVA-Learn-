package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 23:10
 **/
public class TestLogin {
    public static boolean login(String Username, String Password){
        String username = "zhangsan";
        String password = "123456";
        if(username.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter username and password");
        String username= sc.next();
        String password= sc.next();
        if (login(username, password)){
            System.out.println("login successful");

        }else{
            System.out.println("login failed");
        }
    }
}
