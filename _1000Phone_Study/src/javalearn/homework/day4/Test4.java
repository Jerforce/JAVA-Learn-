package javalearn.homework.day4;

/**
 * @author Lenovo
 * @create 2023/3/22 19:16
 **/
public class Test4 {
    public static int random(){
        int a = (int)(Math.random()*100);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(random());
    }
}
