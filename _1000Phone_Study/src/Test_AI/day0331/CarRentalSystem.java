package Test_AI.day0331;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 19:47:31
 */
    public class CarRentalSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Car> cars = new ArrayList<>();
            cars.add(new Car("奔驰", "轿车", "Bench-A0E2", 18000));
            cars.add(new Car("奔驰", "跑车", "Bench-A0CE", 298000));
            cars.add(new Car("奔驰", "越野车", "Bench-A0B4", 88800));

            System.out.println("请输入您要租赁的车型：");
            String carType = scanner.nextLine();
            System.out.println("请输入租赁时间（小时）：");
            int rentTime = scanner.nextInt();

            for (Car car : cars) {
                if (car.getType().equals(carType)) {
                    double rentPrice = car.getRentPrice(rentTime);
                    System.out.println("您租赁的车型为：" + carType + "，租赁时间为：" + rentTime + "小时，租赁价格为：" + rentPrice + "元");
                    break;
                }
            }
        }
    }

    class Car {
        private String brand;
        private String type;
        private String model;
        private double price;

        public Car(String brand, String type, String model, double price) {
            this.brand = brand;
            this.type = type;
            this.model = model;
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public double getRentPrice(int rentTime) {
            double rentPrice;
            if (type.equals("轿车")) {
                rentPrice = price * rentTime * 0.06*0.1;
            } else if (type.equals("跑车")) {
                rentPrice = price * rentTime * 0.12*0.1;
            } else {
                rentPrice = price * rentTime * 0.08*0.1;
            }
            return rentPrice;
        }
    }
