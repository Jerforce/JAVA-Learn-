package javalearn.classroom;

/**
 * @author Lenovo
 * @create 2023/3/22 17:15
 **/
public class PlusPlus {
    public static void main(String[] args) {
        int a=5;
        int h=(a++)+(a--)+(++a)+(--a);
        /*----6----5-----6----5------
        *   a++返回a的值（即5），然后将a增加到6。
            a--返回a的值（即6），然后将a减少到5。
            ++a将a增加到6，然后返回a的值（即6）。
            --a将a减少到5，然后返回a的值（即5）。
        *
        * */
        System.out.println(h);
    }
}
