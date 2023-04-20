package javalearn.oop.opp5;

/**
 * @author Lenovo
 * @create 2023/3/27 14:41
 **/
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[]{new Phone("苹果", 1000, "红色"), new Phone("华为", 1000, "白色"), new Phone("小米", 800, "黑色")};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        int avg = sum / arr.length;
        System.out.println(avg);

    }
}
