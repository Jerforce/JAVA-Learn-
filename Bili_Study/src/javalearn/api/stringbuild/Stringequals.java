package javalearn.api.stringbuild;

/**
 * @author Lenovo
 * @create 2023/3/27 19:10
 **/
public class Stringequals {
    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        String s4 = "a" + "b"+"c";
        System.out.println(s1 == s3);
        // new 了新地址
        System.out.println(s1==s4);
        //自解码文件已经拼好

        /*
        扩容 16 空参 capacity
        16*2+2
        之和就是实际值

        * */

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 37; i++) {
            sb.append("a");
        }
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);
        System.out.println(sb.capacity());
    }
}