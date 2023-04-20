package javalearn.oop.oop6;

/**
 * @author Lenovo
 * @create 2023/3/27 14:45
 **/
public class GirlfirendTest {
    public static void main(String[] args) {

        Girlfriend[] array = new Girlfriend[4];
        Girlfriend gf1 = new Girlfriend("A1", 20, '女', "篮球");
        Girlfriend gf2 = new Girlfriend("A2", 19, '女', "看书");
        Girlfriend gf3 = new Girlfriend("A3", 23, '女', "玩游戏");
        Girlfriend gf4 = new Girlfriend("A4", 22, '女', "玩游戏");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            Girlfriend gf = array[i];
            sum += gf.getAge();
        }
        int avg = sum / array.length;
        int count=0;
        for (int i = 0;i<array.length;i++) {
                Girlfriend gf = array[i];
                if (gf.getAge()<avg) {
                    count++;
                    System.out.println(gf.getName()+gf.getAge()+gf.getHobby());
                }
        }
        System.out.println(count+"个");
    }
}
