package lsy.java.Text;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Admin ae = new Admin(5);
        Rights er = new Rights(7);
        Scanner input =new Scanner(System.in);
        Data mod1 = new Data("A1", "123", "0000");
        Data mod2 = new Data("A2", "321", "0000");
        er.adduser(mod1);er.adduser(mod2);
        if (er.permission() ) {
            Commod a1 = new Commod("可比克", "膨化食品", 4,30);
            Commod a2 = new Commod("虾条","休闲食品", 4,40);
            Commod a3 = new Commod("上好佳", "膨化食品", 5,35);
            ae.add(a1);
            ae.add(a2);
            ae.add(a3);
            while (true) {
                System.out.println("请选择操作内容\n" + "1.商品管理\t2.用户管理\t3.退出登录");
                int choo = input.nextInt();

                if (choo == 1) {
                    er.choose1(ae);
                } else if (choo == 2) {
                    er.choose2(er);
                }
                else if (choo == 3){break;}
                else {
                    System.out.println(" 输入错误，请输入正确指令");
                }
            }
        }
    }
}