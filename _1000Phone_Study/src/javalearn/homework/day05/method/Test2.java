package javalearn.homework.day05.method;

/**
 * @author Lenovo
 * @create 2023/3/24 9:44
 **/
public class Test2 {
    public static void Triangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k <=j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Triangle();
    }
}
