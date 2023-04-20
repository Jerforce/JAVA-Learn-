package javalearn.Alist.login;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/28 9:50
 **/
public class LoginManage {
    public static void main(String[] args) {
        ArrayList<User>list =new ArrayList<>();
        for (int i = 0; i <3;i++) {
            Scanner sc = new Scanner(System.in);
            User user = new User();
            System.out.println("请输入用户id：");
            int id = sc.nextInt();
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();


            user.setUserID(id);
            user.setUserName(username);
            user.setPassword(password);

            list.add(user);
        }
      Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的用户id：");
        int id = sc.nextInt();
        int index = GetSerchIDinfo(list,id);
        System.out.println(index);
        if (index != -1) {
            System.out.println("查找成功");
            }else{
            System.out.println("查找失败");
        }
    }

    public static int  GetSerchIDinfo(ArrayList<User>list,int id){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserID() == id) {
                return i;
            }
    }
        return -1;
    }



}
