package javalearn.api.demostring.string;

/**
 * @author Lenovo
 * @create 2023/3/27 17:43
 **/
public class Demo6 {
    public static void main(String[] args) {
        String id = "433005200012013437";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);


        char gender = id.charAt(16);
        //ASCll 表
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }
        System.out.println(year + "年 " + month + "月 "+day+" 日"  );
    }
}
