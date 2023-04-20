/**
 * @author Jerforce
 * @date 2023/4/6 星期四 16:56:56
 */
public class demo {
    public class Plane implements Flyable {
        @Override
        public void fly() {
            System.out.println("xx飞行");
        }
    }
    public class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("xxx飞行");
        }
    }

    public class Day{
        public void show(Flyable flyable){
            System.out.println("xx飞行开始");
            flyable.fly();
        }
    }
}
