package javalearn.api.stringbuild;

/**
 * @author Lenovo
 * @create 2023/3/27 18:44
 **/
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        arrtoString(arr);
        System.out.println(arrtoString(arr));
    }

    public static String arrtoString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");//链式拼接
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }

        }
        sb.append("]");

        return sb.toString();

    }
}
