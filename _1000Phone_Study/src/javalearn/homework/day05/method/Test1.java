package javalearn.homework.day05.method;

/**
 * @author Lenovo
 * @create 2023/3/24 9:36
 **/
public class Test1 {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 10000; i <=99999; i++){
            if(isPalindrome(String.valueOf(i))){
                System.out.println(i);
            }
        }
    }
}
