package javalearn.oop.oop6;

/**
 * @author Lenovo
 * @create 2023/3/27 14:44
 **/
public class Girlfriend {
    private String name;
    private int age;
    private char brand;
    private String hobby;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, char brand, String hobby) {
        this.name = name;
        this.age = age;
        this.brand = brand;
        this.hobby = hobby;
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
     * @return brand
     */
    public char getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(char brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Girlfriend{name = " + name + ", age = " + age + ", brand = " + brand + ", hobby = " + hobby + "}";
    }
}
