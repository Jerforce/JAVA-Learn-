package javalearn.day3.IPE;

/**
 * @author Lenovo
 * @create 2023/3/24 17:24
 **/
public class Demo4 {
    //private < 默认的 < protected < public
    public class Monster {
        //@Override
        public void eat(String food) {
            System.out.println("eat" + food);
        }

        public void hit(String name) {
            System.out.println("hit" + name);

        }
    }

        public class GSL extends Monster {
            public void call(String name) {
                System.out.println("call" + name);
            }
        }

    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        GSL gsl = demo4.new GSL();
        gsl.eat("apple");
        gsl.eat("banana");
        gsl.eat("orange");
        gsl.hit("Tom");

    }



}