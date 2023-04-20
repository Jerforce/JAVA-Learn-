package Thread;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 15:41:18
 */
class threadMain {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
    class Mythread1 extends Thread {
        @Override
        public void run() {
            for(int i = 0; i <100;i++){
                if(i==50){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"HelloWorld!");
            }
        }
    }
    class Mythread2 extends Thread {
        @Override
        public void run() {
            for(int i = 0; i <100;i++){
                if(i==50){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"HelloWorld!");
            }

        }

    }

