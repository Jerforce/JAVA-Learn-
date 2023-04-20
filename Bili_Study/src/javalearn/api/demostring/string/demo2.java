package javalearn.api.demostring.string;

/**
 * @author Lenovo
 * @create 2023/3/27 16:26
 **/
public class demo2 {

    public static String arrtoString(int[] arr) {

        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";

        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ",";

            }

        }
        result = result + "]";
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrtoString(arr));
    }
}