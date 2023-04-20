package javalearn.homework.day4;

/**
 * @author Lenovo
 * @create 2023/3/22 19:51
 **/
public class TestH2 {
    /**
     * 定义一个公共静态方法，返回类型为int，方法名为getMaxNarcissisticNumber
     */
    public static int getMaxNarcissisticNumber() {
        //定义一个整型变量max并初始化为0
        int max = 0;
        //使用for循环，从0到999遍历每个数
        for (int i = 0; i < 1000; i++) {
            //定义一个整型变量sum并初始化为0
            int sum = 0;
            //定义一个整型变量temp并初始化为i
            int temp = i;
            //使用while循环，计算i的每个位上的数字的n次幂之和
            while (temp > 0) {
                //取出temp的个位数
                int digit = temp % 10;
                //计算digit的3次幂并加到sum上
                sum += digit * digit * digit;
                //去掉temp的个位数
                temp /= 10;
            }
            //如果sum等于i并且i大于max，则将i赋值给max
            if (sum == i && i > max) {
                max = i;
                //返回最大的水仙花数
            }

        }

        return max;
    }

    public static void main (String[]args){
        System.out.println(getMaxNarcissisticNumber());
}
}

