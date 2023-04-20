package javalearn.oop;

/**
 * @author Lenovo
 * @create 2023/3/27 10:21
 **/
public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",30);
        Role r2 = new Role("鸠摩智",30);
     //回合制的
        while (true) {
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"胜了"+r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"胜了"+r1.getName());
                break;
            }

    }

    }
}
