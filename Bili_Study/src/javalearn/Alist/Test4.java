package javalearn.Alist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 22:03
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("问有多少学生：");
        int num = scanner.nextInt();


        for(int i = 0; i <num; i++) {
            Scanner sc = new Scanner(System.in);
            Student s = new Student();
            //new 在循环里面
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            s.setName(name);

            list.add(s);
        }

        for(int i = 0; i < num; i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+" "+stu.getAge());
        }
    }
}