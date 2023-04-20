package javalearn.oop.Test;

/**
 * @author Lenovo
 * @create 2023/3/24 19:29
 **/
public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();
        p.brand="苹果";
        p.price=1000.0;
        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);
        //调用手机中的方法
        p.call();
        p.play();

    }
}
