package javalearn.homework.day11.StudentsBulider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Jerforce
 * @date 2023/4/11 星期二 19:38:44
 */
public class StudentsSystem {
    public static void main(String[] args) {
        Students s1 = new Students(1, "张三", 23, "男");
        Students s2 = new Students(2, "李四", 24, "女");
        Students s3 = new Students(3, "王五", 25, "男");
        Students s4 = new Students(4, "赵六", 23, "女");
        Students s5 = new Students(5, "田七", 24, "男");
        Students s6 = new Students(6, "孙八", 25, "男");
        Students s7 = new Students(7, "周九", 23, "女");
        Students s8 = new Students(8, "郑十", 24, "男");
        Students s9 = new Students(9, "王二", 25, "女");
        Students s10 = new Students(10, "赵三", 23, "男");
        Students s11 = new Students(11, "田四", 24, "男");

        ArrayList<Students> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);

        for (Students student : students) {
            System.out.println(student);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的姓名:");
        String name = sc.next();
        for (Students student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
            }
        }

        System.out.println("请输入你要查找的学生姓名:");
        String name1 = sc.next();
        for (Students student : students) {
            if (student.getName().equals(name1)) {
                System.out.println(student);
            }
        }
        //学生的总人数
        System.out.println("总人数:" + students.size());
        //根据学号查找学生并返回学生对象
        System.out.println("根据学号查找学生并返回学生对象");
        System.out.println("请输入你要查找的学生学号:");
        int id = sc.nextInt();
        for (Students student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
        //根据姓名查找学生并返回学生对象
        System.out.println("根据姓名查找学生并返回学生对象");
        System.out.println("请输入你要查找的学生姓名:");
        String name2 = sc.next();
        for (Students student : students) {
            if (student.getName().equals(name2)) {
                System.out.println(student);
            }
        }
        //根据性别查找学生并返回学生对象
        System.out.println("根据性别查找学生并返回学生对象");
        System.out.println("请输入你要查找的学生性别('男'/'女'):");
        String sex = sc.next();
        for (Students student : students) {
            if (student.getSex().equals(sex)) {
                System.out.println(student);
            }
        }
        //根据年龄查找学生并返回学生对象
        System.out.println("根据年龄查找学生并返回学生对象");
        System.out.println("请输入你要查找的学生年龄:");
        int age = sc.nextInt();
        for (Students student : students) {
            if (student.getAge() == age) {
                System.out.println(student);
            }
        }
      //根据学号对学生列表进行升序排序
     /*   System.out.println("根据学号对学生列表进行升序排序");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getId() > students.get(j).getId()) {
                    Students temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        for (Students student : students) {
            System.out.println(student);
        }*/
        Collections.sort(students, Comparator.comparingInt(Students::getId));

       // 根据年龄对学生列表进行降序排序
       /* System.out.println("根据年龄对学生列表进行降序排序");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getAge() < students.get(j).getAge()) {
                    Students temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        for (Students student : students) {
            System.out.println(student);
        }*/
        Collections.sort(students, Comparator.comparingInt(Students::getAge).reversed());
    }
}
