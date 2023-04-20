package javalearn.homework.day08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/28 19:09
 **/
public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<>();
        String liSense[] = {"car", "seden", "Truck", "bus"};
        Car car = new Car("car", "奔驰", 10000, "鄂A00002");
        Car car1 = new Car("seden", "奔驰", 10000, "鄂A0001");
        Car car2 = new Car("Truck", "奔驰", 10000, "鄂A0003");
        Car car3 = new Car("bus", "奔驰", 10000, "鄂A0004");

        list.add(car);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询的车牌:");
        String s = sc.next();
        String Right = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPlate().equals(s)) {
                System.out.println(list.get(i));
                for (int j = 0; j < liSense.length; j++) {
                    if (list.get(i).getLiSense().equals(liSense[j])) {
                        Right = liSense[j];
                        if (Right.equals("Car")) {
                            car.Start();
                            car.getPrice();
                        } else if (Right.equals("Truck")) {
                            Truck.Start();
                            Truck.loadtheCar();
                        } else if (Right.equals("seden")) {
                            Seden.Start();
                        } else if (Right.equals("bus")) {
                            Bus.Start();
                            Bus.loadtheCar();
                        }
                    }
                }
            }
        }
    }
}

