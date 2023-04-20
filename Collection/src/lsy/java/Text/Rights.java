package lsy.java.Text;

import java.util.Arrays;
import java.util.Scanner;

public class Rights extends Admin implements Management {
    Data[] user;
    int count = 0;//表示用户数目

    public Rights(int size) {
        super(size);
        if (size <= 0) {
            user = new Data[5];
        } else
            user = new Data[size];
    }

    //登录权限检验
    public boolean permission() {
        int a = 0;
        while (a <= count) {
            System.out.println("请输入账号：");
            Scanner input = new Scanner(System.in);
            String acc = input.next();
            System.out.println("请输入密码");
            String key = input.next();
            for (int i = 0; i < count; i++) {
                if (acc.equals(user[i].getAcc()) && key.equals(user[i].getKey())) {
                    System.out.println("欢迎登录管理员系统");
                    return true;
                }
                a = i+1;
            }
            System.out.println("输入的账号或密码错误 请重新输入");
        }
        return false;
    }

    @Override//添加用户
    public void addUser() {
        Scanner input = new Scanner(System.in);
        Data z =new Data();
        System.out.println("请输入注册用户的ID:");
        z.setUsername(input.next());
        System.out.print("\t账号:");
        z.setAcc(input.next());
        System.out.print("\t密码:");
        z.setKey(input.next());
        int legth = user.length;
        if (count >= legth) {
            int newlegth = user.length * 2;
            user = Arrays.copyOf(user, newlegth);
        }
        user[count] = z;
        count++;
    }
    public void  adduser(Data a){
        int legth = user.length;
        if (count >= legth) {
            int newlegth = user.length * 2;
            user = Arrays.copyOf(user, newlegth);
        }
        user[count] = a;
        count++;
    }

    @Override//删除数据
    public void delteUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的用户ID");
        String id =input.next();
        for (int i = 0; i < count; i++) {
            if (id.equals(user[i].getUsername())) {
                for (int k = i; k < count - 1; k++) {
                    user[i] = user[i + 1];
                }
                user[count - 1] = null;
                break;
            }
        }
        System.out.println("删除成功\n"+"----------------");
    }

    @Override
    public//查找数据
    Data findUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户ID:");
        String id =input.next();
        for (int i = 0; i < count; i++) {
            if (id.equals(user[i].getUsername())) {
                System.out.println("存在该用户，详细信息为:");
                System.out.println("----------------");
                user[i].printf();
                System.out.println("----------------");
                return user[i];
            }
        }
        System.out.println("未查询到该用户");
        return null;
    }

    //修改数据
    public void reviseuser() {
        Data temp = findUser();
        Scanner input = new Scanner(System.in);
        if (temp != null) {
            System.out.println("请输入修改后的用户信息:\n"  + "用户名称:");
            temp.setUsername(input.next());
            System.out.println("用户账号:");
            temp.setAcc(input.next());
            System.out.println("用户密码:");
            temp.setKey(input.next());
            System.out.println("修改成功\n"+"----------------");
        }
    }

    //打印数组信息
    public void printfuser() {
        for (int i = 0; i < count; i++) {
            if (user[i] != null) user[i].printf();
        }
    }

    //管理员权限选择
    public void choose1(Admin ovo) {
        Scanner input =new Scanner(System.in);
        int num ;
        while (true) {
            System.out.println("请选择相关操作");
            System.out.println("1.增加商品2.查询商品信息3.修改商品信息4.删除商品5.打印商品信息");
            int cho = input.nextInt();
            switch (cho) {
                case 1:
                    ovo.addone();
                    break;
                case 2:
                    ovo.find();
                    break;
                case 3:
                    ovo.revise();
                    break;
                case 4:
                   ovo.delte();
                    break;
                case 5:
                    ovo.printfInfo();
                    break;
            }
            System.out.println("是否继续操作"+"\n"+"1.继续"+"\t2.退出");
            num = input.nextInt();
            if (num == 1){}
            else break;
        }
    }
    //修改用户数组
    public  void choose2(Rights ovo){
        while (true) {
            Scanner input = new Scanner(System.in);
            int num;
            System.out.println("请选择相关操作");
            System.out.println("1.注册用户2.查询用户信息3.修改用户信息4.删除用户5.打印用户信息");
            int num1 = input.nextInt();
            switch (num1){
                case  1:ovo.addUser();break;
                case 2:ovo.findUser();break;
                case 3:ovo.reviseuser();break;
                case 4:ovo.delteUser();break;
                case 5:ovo.printfuser();break;
            }
            System.out.println("是否继续操作"+"\n"+"1.继续"+"\t2.退出");
            num = input.nextInt();
            if (num == 1){}
            else break;
        }
    }
}
