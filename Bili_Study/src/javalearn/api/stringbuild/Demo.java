package javalearn.api.stringbuild;

/**
 * @author Lenovo
 * @create 2023/3/27 17:52
 **/
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        StringBuilder sb1 = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb1.toString());
        
        sb.append("world");
        System.out.println(sb);

        sb.replace(1,3,"TMD");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);

        sb.append("abc");
        sb.append("ccc");
        sb.append("dsd");
        System.out.println(sb);

        System.out.println("================================================");
        sb.append("abc").append("ccc").append("dsd");
        System.out.println(sb);
        sb.delete(1,16);
        System.out.println(sb);


    }
}
