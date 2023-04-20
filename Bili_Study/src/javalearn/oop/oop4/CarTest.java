package javalearn.oop.oop4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 14:30
 **/
public class CarTest {
    public static void main(String[] args) {


        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();//创建对象必须要在循环里面，
            System.out.println("请输入车的品牌:");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入车的价格:");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入车的数量:");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+car.getPrice()+car.getColor());
        }


    }
}