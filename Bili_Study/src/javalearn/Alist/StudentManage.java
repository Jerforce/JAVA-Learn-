package javalearn.Alist;

import java.util.ArrayList;

/**
 * @author Lenovo
 * @create 2023/3/27 22:00
 **/
public class StudentManage {
    public static void main(String[] args) {


    ArrayList<Student>list = new ArrayList<>();
    Student s1 = new Student("张三",18);
    Student s2 = new Student("李四",19);
    Student s3 = new Student("王五",20);

    list.add(s1);
    list.add(s2);
    list.add(s3);


    for (int i = 0; i < list.size(); i++) {
        Student stu = list.get(i);
        System.out.println(stu.getName()+" "+stu.getAge());
    }

    }
}