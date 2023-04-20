package javalearn.api.demostring;

/**
 * @author Lenovo
 * @create 2023/3/27 15:59
 **/
public class demo {
    public static void main(String[] args) {
        String s1 ="acvd";
        System.out.println(s1);

        //================================================
        String s2 = new String();
        System.out.println("@"+s2+"!");

        String s3 = new String("abc");
        System.out.println(s3);

        char[]chs={'a','b','c','d','e','f'};
        String s5 = new String(chs);
        System.out.println(s5);

        //网络传输应用场景转码
        byte[] b = {97,98,99};
        String s4 = new String(b);
        System.out.println(s4);

    }


}
