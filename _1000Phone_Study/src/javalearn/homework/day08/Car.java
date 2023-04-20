package javalearn.homework.day08;

/**
 * @author Lenovo
 * @create 2023/3/28 18:57
 **/
public class Car {
    public String liSense; //车型
    public String brand; //品牌
    public double price; //价格
    public String plate; //车牌


    public Car(String liSense, String brand, double price,String plate) {
        this.liSense = liSense;
        this.brand = brand;
        this.price = price;
        this.plate = plate;
    }

    public Car() {

    }

    public static void Start() {
        System.out.println("Starting the car");

    }
    public double getPrice() {
        return price;
    }

    /**
     * 获取
     * @return liSense
     */
    public String getLiSense() {
        return liSense;
    }

    /**
     * 设置
     * @param liSense
     */
    public void setLiSense(String liSense) {
        this.liSense = liSense;
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
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * 设置
     * @param plate
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String toString() {
        return "Car{liSense = " + liSense + ", brand = " + brand + ", price = " + price + ", plate = " + plate + "}";
    }
}

class Seden extends Car {
    private static final double RenTEl_Rate=100.0;
    public Seden(String liSense, String brand, double price,String plate) {
        super(liSense, brand, price,plate);

    }

    public static void Start() {
        System.out.println("Starting the Seden");
    }
    @Override
    public double getPrice() {
        return super.getPrice()/365*+RenTEl_Rate;
    }
    public void RentforSeden() {
        System.out.println(getPrice());

    }
}

class Truck extends Car {
    private static final double RenTEl_Rate=150.0;
    public Truck(String liSense, String brand, double price, String plate) {
        super(liSense, brand, price,plate);

    }

    public static void Start() {
        System.out.println("Starting the Truck");
    }
    public static void loadtheCar() {
        System.out.println("Loading the truck");
    }
    @Override
    public double getPrice() {
        return super.getPrice()/365*+RenTEl_Rate;
    }
    public void RentforTurk() {
        System.out.println(getPrice());

    }

}
class Bus extends Car {
    private static final double RenTEl_Rate=200.0;
    public Bus(String liSense, String brand, double price,String plate) {
        super(liSense, brand, price,plate);

    }

    public static void Start() {
        System.out.println("Starting the Bus");
    }
    public static void loadtheCar() {
        System.out.println("Loading the Bus Station");
    }
    @Override
    public double getPrice() {
        return super.getPrice()/365*+RenTEl_Rate;
    }
    public  void RentforBus() {
        System.out.println(getPrice());

    }
}
class Person {
    public void UseCar(Car car) {
        Car.Start();
        System.out.println("The price of the car is " + car.getPrice());
        if (car instanceof Seden) {
            Seden sedon = (Seden) car;
            sedon.Start();
            System.out.println("The price of the sedon is " + sedon.getPrice());
        } else if (car instanceof Truck) {
            Truck truck = (Truck) car;
            truck.Start();
            truck.loadtheCar();
        } else if (car instanceof Bus) {
            Bus bus = (Bus) car;
            bus.Start();
            bus.loadtheCar();
        }
    }
}