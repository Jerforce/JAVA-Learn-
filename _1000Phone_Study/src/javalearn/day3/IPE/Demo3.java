package javalearn.day3.IPE;

/**
 * @author Lenovo
 * @create 2023/3/24 17:02
 **/
public class Demo3 {
    //一旦继承了某一个类，理论来说就继承该类的所有属性和方法。

    public class Create {
        public String name;
        public int age;
        public String sex;

        public void breath() {
            System.out.println("now breathing");
        }
    }
    public class animals extends Create{
        public void eat(){
            System.out.println("now eating");
        }
        public void sleep(){
            System.out.println("now sleeping");
        }
    }
    public class Dog extends animals{
        public String perColor;
        public void run(){
            System.out.println("now running");
        }

    }


    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        Dog dog = demo.new Dog();
        dog.perColor = "red";
        dog.name = "Tom";
        dog.age = 10;
        dog.sex = "male";
        System.out.println("this dog's name is " + dog.name + " and age is " + dog.age + " and sex is " + dog.sex + " and perColor is " + dog.perColor);
        dog.eat();
        dog.sleep();
        dog.breath();
        System.out.println("this dog  wake up now");
        dog.run();
    }
}
