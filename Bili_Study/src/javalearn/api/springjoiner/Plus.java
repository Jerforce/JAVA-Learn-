package javalearn.api.springjoiner;

import java.util.StringJoiner;

/**
 * @author Lenovo
 * @create 2023/3/27 18:57
 **/
public class Plus {
    public static void main(String[] args) {

        StringJoiner plus = new StringJoiner("+","=","+");
        plus.add("1").add("2").add("3");;
        System.out.println(1+2+3);
        System.out.println(plus.add("0"));
        int len = plus.length();
        System.out.println(len);
    }
}
