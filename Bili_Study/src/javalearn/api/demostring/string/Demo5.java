package javalearn.api.demostring.string;

/**
 * @author Lenovo
 * @create 2023/3/27 17:34
 **/
public class Demo5 {
    public static void main(String[] args) {
        String PhoneNumber ="13114339274";
        String str= PhoneNumber.substring(PhoneNumber.length()-4);
        System.out.println(str);

        String str1=PhoneNumber.substring(0,3);
        String end = PhoneNumber.substring(7);
        System.out.println(str1);
        String result=PhoneNumber.substring(0,3)+"****"+PhoneNumber.substring(7);
        System.out.println(result);
    }
}