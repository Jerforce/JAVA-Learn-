package javalearn.homework.day3;

/**
 * @author Lenovo
 * @create 2023/3/22 15:43
 **/
public class Test4Re {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int k = 100 - i - j;
                if (k % 3 == 0 && 5 * i + 3 * j + k / 3 == 100) {
                    //雏鸡为1/3而数量上要取整---》K%3==0
                    System.out.println("公鸡：" + i + "只，母鸡：" + j + "只，雏鸡：" + k + "只");
                }
            }
        }

    }
}
