package javalearn.homework.day2;

import java.util.Random;

/**
 * @author Lenovo
 * @create 2023/3/22 9:53
 **/
public class Test5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) - 1;
        System.out.println("生成几种不同的随机数");
        System.out.println("生成的随机数是：" + randomNumber);

        int randomnum = (int) Math.random() * (10 - 1) + 1;
        //(int)强制转换,,否则double更合适
        System.out.println("生成的随机数是" + randomnum);

        int a = (int) (Math.random() * 10);
        System.out.println("生成的随机数是" + a);
        if (a == (randomnum = randomNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

}

