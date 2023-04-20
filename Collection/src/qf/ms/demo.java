package qf.ms;

/**
 * @author Jerforce
 * @date 2023/4/3 星期一 17:23:40
 */
public class demo {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}

class A {
    static {
        System.out.println("A");
    }

    public A() {
        System.out.println("a");
    }
}
    class B extends A {
        static {
            System.out.println("B");
        }

        public B() {
        System.out.println("b");
            }
    }
