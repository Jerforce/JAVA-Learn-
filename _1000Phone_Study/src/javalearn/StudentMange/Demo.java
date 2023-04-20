package javalearn.StudentMange;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/23 14:56
 **/
public class Demo {
    public static class StudentManager {
        //定义String数组用于存放学生信息(姓名)
        static String[] students = {};
        //定义变量用于保存有效个数
        static int size = 0;

        //判断学生是否存在
        public static int exists(String name) {
            for (int i = 0; i < size; i++) {
                if (name.equals(students[i])) {
                    return i;
                }
            }
            return -1;
        }

        //增加学生
        public static boolean insertStudent(String name) {
            //1、先判断学生是否存在
            int index = exists(name);
            if (index != -1) { //表示存在
                return false;
            }
            //2、判断是否需要扩容
            if (size == students.length) {
                students = Arrays.copyOf(students, students.length + 5);
            }
            //3、将name添加到数组中
            students[size] = name;
            //4、有效个数+1
            size++;
            return true;
        }

        //删除学生
        public static boolean deleteStudent(String name) {
            //1、判断学生是否存在
            int index = exists(name);
            if (index == -1) {//表示不存在
                return false;
            }
            //2、考虑到如果数组的元素个数刚好与数组的长度向的时候，删除元素会出现问题
            if (size == students.length) {
                students = Arrays.copyOf(students, students.length + 5);
            }
            //3、将学生从数组中删除掉
            for (int i = index; i < size; i++) {
                students[i] = students[i + 1];
            }
            //4、有效个数-1
            size--;
            return true;
        }

        //修改学生
        public static boolean updateStudent(String oldName, String newName) {
            //1、判断学生是否存在
            int index1 = exists(oldName);
            if (index1 == -1) {
                return false;
            }
            //2、判断新学生是否存在
            int index2 = exists(newName);
            if (index2 != -1) {
                return false;
            }
            //3、用newName替换oldName
            students[index1] = newName;
            return true;
        }

        //查询学生
        public static String[] selectStudent() {
            return students;
        }

        //前端开发
        static Scanner sc = new Scanner(System.in);

        public static void studentMangeView() {
            System.out.println("=======欢迎进入千锋学生管理系统=======");
            while (true) {
                System.out.println("1、增加\t2、修改\t3、删除\t4、查询\t5、退出");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        insertView();
                        break;
                    case 2:
                        updateView();
                        break;
                    case 3:
                        deleteView();
                        break;
                    case 4:
                        selectView();
                        break;
                    case 5:
                        System.out.println("欢迎下次使用!!!");
                        return;
                    default:
                        System.out.println("你的输入有误，请重新输入！！！");
                        break;
                }
            }
        }

        public static void selectView() {
            //调用后端的删除的操作
            String[] students = selectStudent();
            if (size == 0) {
                System.out.println("暂无数据");
            } else {
                for (int i = 0; i < size; i++) {
                    if (i % 5 == 0 && i != 0) {
                        System.out.println();
                    }
                    System.out.print(students[i] + "\t");
                }
                System.out.println();
            }

        }

        public static void deleteView() {
            System.out.println("请输入要删除的学生");
            String name = sc.next();
            //调用后端的删除的操作
            if (deleteStudent(name)) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }

        public static void updateView() {
            System.out.println("请输入要修改的学生");
            String oldName = sc.next();
            System.out.println("请输入要修改后的学生");
            String newName = sc.next();
            //调用后端的修改的操作
            if (updateStudent(oldName, newName)) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        }

        public static void insertView() {
            System.out.println("请输入要添加的学生");
            String name = sc.next();
            //调用后端的添加操作
            boolean b = insertStudent(name);
            if (b) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        }
        public static void main(String[] args) {
            studentMangeView();
        }
    }
}