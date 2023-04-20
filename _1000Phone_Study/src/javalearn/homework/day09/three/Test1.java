package javalearn.homework.day09.three;

/**
 * @author Lenovo
 * @create 2023/3/28 20:29
 **/
public class Test1 {
    public abstract class Animal {
        private String breed;

        private int age;
        private String brand;

        public abstract void eat();

    }
    public class Dog extends Animal {
        private String Furcolor;
        @Override
        public void eat() {
            System.out.println("狗吃骨头");
    }
        public void Playball() {
            System.out.println("狗撞球");
        }
    }
    public class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("猫吃鱼");
        }
        public void giao() {
            System.out.println("猫叫");
        }
    }
    public static class Test {
        public static void main(String[] args) {
           Test1 test1 = new Test1();
           Dog dog = test1.new Dog();
           dog.eat();
           dog.Playball();
           Cat cat = test1.new Cat();
           cat.eat();
           cat.giao();



        }
    }


}
