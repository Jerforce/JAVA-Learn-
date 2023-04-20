package javalearn.homework.day4;

public class Test3 {
    public static void Prints(String name, String age, String sex, String address){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+sex);
        System.out.println("住址"+address);
    }
    public static void main(String[] args) {
        Prints("张三","20","男","北京");
    }
}
