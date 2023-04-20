package Thread;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 15:47:51
 */
class ThreadMethod {
    public static void main(String[] args) {
        Mythread3 t1 = new Mythread3();
        Mythread4 t2 = new Mythread4();
        t1.start();
        t2.start();
    }
}
class MyObj{
    public static Object obj = new Object();

}
class Mythread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(currentThread()+"========" + i);
            if (i == 20) {
                synchronized (MyObj.obj) {
                    try {
                        MyObj.obj.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(currentThread().getName());
    }
}

class Mythread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(currentThread()+"========" + i);
        }

    }
}
