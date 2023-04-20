package javalearn.homework.day07.simoop;

/**
 * @author Lenovo
 * @create 2023/3/24 14:26
 **/
public class RacingCar {
    public static class Car {
        String brand;//品牌
        int maxSpeed;//最大速度
        String color;//颜色
        int horsePower;//马力

        public Car() {
        }

        public Car(String brand, int maxSpeed, String color, int horsePower) {
            this.brand = brand;
            this.maxSpeed = maxSpeed;
            this.color = color;
            this.horsePower = horsePower;
        }

        public static void start() {
            System.out.println("汽车开始运行");
        }
        public static void stop() {
            System.out.println("汽车停止运行");
        }
        public static void turnLeft() {
            System.out.println("汽车左转");
        }
        public static void turnRight() {
            System.out.println("汽车右转");
        }
        public static void accelerate() {
            System.out.println("汽车加速");
        }
        public static void decelerate() {
            System.out.println("汽车减速");
        }

        /**
         * 获取
         * @return brand
         */
        public String getBrand() {
            return brand;
        }

        /**
         * 设置
         * @param brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        /**
         * 获取
         * @return maxSpeed
         */
        public int getMaxSpeed() {
            return maxSpeed;
        }

        /**
         * 设置
         * @param maxSpeed
         */
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        /**
         * 获取
         * @return color
         */
        public String getColor() {
            return color;
        }

        /**
         * 设置
         * @param color
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * 获取
         * @return horsePower
         */
        public int getHorsePower() {
            return horsePower;
        }

        /**
         * 设置
         * @param horsePower
         */
        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String toString() {
            return "Car{brand = " + brand + ", maxSpeed = " + maxSpeed + ", color = " + color + ", horsePower = " + horsePower + "}";
        }
    }
    
    public static class CarPlayer {
        String name;//姓名
        int age;//年龄
        String typeCar;//类型车手
        String number;//车手编号

        public CarPlayer() {
        }

        public CarPlayer(String name, int age, String typeCar, String number) {
            this.name = name;
            this.age = age;
            this.typeCar = typeCar;
            this.number = number;
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         * @return age
         */
        public int getAge() {
            return age;
        }

        /**
         * 设置
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * 获取
         * @return typeCar
         */
        public String getTypeCar() {
            return typeCar;
        }

        /**
         * 设置
         * @param typeCar
         */
        public void setTypeCar(String typeCar) {
            this.typeCar = typeCar;
        }

        /**
         * 获取
         * @return number
         */
        public String getNumber() {
            return number;
        }

        /**
         * 设置
         * @param number
         */
        public void setNumber(String number) {
            this.number = number;
        }

        public String toString() {
            return "CarPlayer{name = " + name + ", age = " + age + ", typeCar = " + typeCar + ", number = " + number + "}";
        }
    }


    public static void main(String[] args) {
        Car car1 = new Car("奔驰", 100, "红色", 100);
        System.out.println(car1);
        CarPlayer carPlayer1 = new CarPlayer("张三", 20, "蓝色", "001");
        System.out.println(carPlayer1);
        System.out.println("比赛开始");
        Car.start();
        Car.accelerate();
        System.out.println("进入弯道");
        Car.decelerate();
        Car.turnRight();
        Car.accelerate();
        Car.decelerate();
        Car.turnLeft();
        System.out.println("又到了直线路段");
        Car.accelerate();
        System.out.println("冲过终点");
        Car.stop();

    }
    

}

