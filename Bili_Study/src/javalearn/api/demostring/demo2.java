package javalearn.api.demostring;

/**
 * @author Lenovo
 * @create 2023/3/27 16:10
 **/
public class demo2 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        String c = new String("hello");
        String d="HellO";
        if(a.equals(b)){
            System.out.println("a和b相等");
        }else{
            System.out.println("a和b不相等");
        }
        if(a.equals(c)){
            System.out.println("a和c相等");
        }else{
            System.out.println("a和c相等");
        }

        if(a.equalsIgnoreCase(d)){
            System.out.println("a和d相等");
        }else{
            System.out.println("a和d不相等");
        }

    }
}


