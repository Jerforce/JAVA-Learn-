package javalearn.Alist.phone;

/**
 * @author Lenovo
 * @create 2023/3/28 10:15
 **/
public class Phone {
    private String Brand;
    private int price;

    public Phone() {
    }

    public Phone(String Brand, int price) {
        this.Brand = Brand;
        this.price = price;
    }

    /**
     * 获取
     * @return Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * 设置
     * @param Brand
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
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

    public String toString() {
        return "Phone{Brand = " + Brand + ", price = " + price + "}";
    }
}
