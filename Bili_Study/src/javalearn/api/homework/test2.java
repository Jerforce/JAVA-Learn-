package javalearn.api.homework;

/**
 * @author Lenovo
 * @create 2023/3/27 20:32
 **/
public class test2 {
    public static void main(String[] args) {
        String a = "acbde";
        String b = "cbdea";
        Boolean result = testString(a, b);
        System.out.println(result);

    }

    public static boolean testString(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            a = roasted(a);
            if (a.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public static String roasted(String str) {
       /* char c = str.charAt(0);
       String end= str.substring(1);
        return end+c;*/

        char[] arr = str.toCharArray();
        char firstChar = arr[0];
        char lastChar = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstChar;

        String result = new String(arr);
        return result;

    }
}

