package javalearn.oop.opp1;

/**
 * @author Lenovo
 * @create 2023/3/27 11:17
 **/
public class GameTest {
    public static void main(String[] args) {
        Role role = new Role("乔峰", 20, '男');
        Role role2 = new Role("鸠摩智",30,'男');
       role. ShowNameInfo();
       role2.ShowNameInfo();
    }
}
