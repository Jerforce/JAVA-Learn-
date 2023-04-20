package Regex;

/**
 * @author Jerforce
 * @date 2023/4/1 星期六 10:39:22
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("aa".matches("[a-z]"));//false
        //[a-z]一个[]只能取定一个字符的范围
        System.out.println("aa".matches("[a-z][a-z]"));//ture

        System.out.println("0".matches("[a-zA-z0-9]"));//true
        System.out.println("0".matches("[0-9]"));//true


        System.out.println("================================================");

        System.out.println("a".matches("[a-z&&[def]]"));//false
        System.out.println("d".matches("[a-z&&[def]]"));//true
        // &&为交集 ===》   def


        System.out.println("e".matches("[a-f&&[^bc]]"));//true

        //^bc ==>非bc与a-f的集合  即 a,d,e,f
        System.out.println("e".matches("[a-z&&[^m-p]]"));//true
        System.out.println("q".matches("[a-z&&[^m-p]]"));//true
        //m-p ==>非m-p与a-z的集合  即 a-l q-z


    }
}
