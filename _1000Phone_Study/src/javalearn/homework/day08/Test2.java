package javalearn.homework.day08;

/**
 * @author Lenovo
 * @create 2023/3/28 17:47
 **/
public class Test2 {
    public class Ship {
        private int displacement;
        private int length;
        private int speed;

        public Ship(int displacement, int length, int speed) {
            this.displacement = displacement;
            this.length = length;
            this.speed = speed;
        }

        public void Descibe() {
            System.out.println("displacement:" + displacement + " length:" + length + " speed:" + speed);
        }

        public void move() {
            System.out.println("move");
        }

    }

    public class Destroy extends Ship {
        public Destroy(int displacement, int length, int speed) {
            super(displacement, length, speed);
        }

        public void move() {
            System.out.println("destroy");
        }
       public void fireGuns() {
           System.out.println("fire!!!");
       }
       public void lauchtheMissile() {
            System.out.println("lauch the missile");
       }
       @Override
        public void Descibe() {
           System.out.println("navigating the ship like the destroy");
       }

    }

    public class submarine extends Ship {
        public submarine(int displacement, int length, int speed) {
            super(displacement, length, speed);
        }

        public void dirve() {
            System.out.println("dirving the ship");
        }
        public void surfaces() {
            System.out.println("surfaces the ship");
        }
        @Override
        public void Descibe() {
            System.out.println("navigating the ship like the submarine");
        }

    }

    public class Person{
        public void UseShip(Ship ship) {
            ship.Descibe();
            if(ship instanceof Destroy) {
                Destroy destroy = (Destroy) ship;
                destroy.move();
                destroy.fireGuns();
                destroy.lauchtheMissile();
                destroy.Descibe();
            }
            if(ship instanceof submarine) {
                submarine submarine = (submarine) ship;
                submarine.dirve();
                submarine.surfaces();
                submarine.Descibe();
            }


        }
    }
}
