package javalearn.oop.oop4;

/**
 * @author Lenovo
 * @create 2023/3/27 14:18
 **/

    /*
    * /nextInt() 整数接收   nextDouble（）  接收小数    next（） 接收字符串
    * 这些符号 遇到空格 制表符  回车就会停止接收，，后面的数据就不会接收了
    *
    * 123空格123   第一次需要读取输入  第二次不需要
    *
    * nextLine（） 接收字符串
    *Line 可以接收空格 制表符 遇到回车才会停止接收数据
    * */
public class Car {

    private  String brand;
    private  int price;
    private  String color;

    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
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
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
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

    public String toString() {
        return "Car{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
