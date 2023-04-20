package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/22 20:39
 **/
public class Demo2 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        String[]names= new String[]{"zhangsan","lisi","wangwu"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        String[]names1=new String[3];
        names1[0]="AAA";
        names1[1]="BBB";
        names1[2]="CCC";
        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }
    }
}
