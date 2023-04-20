package javalearn.homework.day09.three;

/**
 * @author Lenovo
 * @create 2023/3/28 20:57
 **/
public class Test2 {
   // 以下是 final 在 Java 中的不同用法：

    /*Final 变量：声明为 final 的变量在初始化后不能被重新赋值。
    这在你想要确保变量的值在整个程序中保持不变时非常有用。*/

/*    public static void main(String[] args) {
        final int x = 5;
        // x = 6; // 这将导致编译时错误
    }*/

    //===============================================================================================
    /*Final 方法：声明为 final 的方法不能被子类重写。
    这在你想要确保方法的实现在整个类层次结构中保持不变时非常有用。*/
   /* class Parent {
        final void print() {
            System.out.println("Parent");
        }
    }

    class Child extends Parent {
        void print() {
            // 这将导致编译时错误
            System.out.println("Child");
         }
    }*/

    //===============================================================================================
    /*Final 类：声明为 final 的类不能被子类化。
    这在你想要确保类的实现保持不变且不能被子类修改时非常有用。*/

/*    final class Parent1 {
        // ...
    }
    class Child1 extends Parent1 {
        // 这将导致编译时错误
    // ...
 }
 */
    //===============================================================================================
    /*Final 参数：声明为 final 的参数在方法内部不能被重新赋值。
    这在你想要确保参数的值在整个方法中保持不变时非常有用。*/
/*
    void print(final int x) {
        // x = 6; // 这将导致编译时错误
        System.out.println(x);
    }
*/










}
