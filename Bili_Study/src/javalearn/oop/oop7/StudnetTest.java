package javalearn.oop.oop7;

/**
 * @author Lenovo
 * @create 2023/3/27 14:54
 **/
public class StudnetTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Student stu4 = new Student(4, "赵六", 21);
        Boolean Flag = AddStudent(arr, stu4.getId());
        if (Flag) {
            System.out.println("重复，修改后再添加id");
        } else {
            int count = countStudent(arr);
            System.out.println(count);
            if (count == arr.length) {
                Student[] newarr = CreateNewArr(arr);
                newarr[count] = stu4;
            } else {
                arr[count] = stu4;
            }

        }
        PrintArr(arr);
    }


    public static Student[] CreateNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    public static Boolean AddStudent(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            int sid = stu.getId();
            if (sid == id) {
                return true;
            }
        }
        return false;
        //循环结束后，才表示没有
    }

    public static int countStudent(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Void PrintArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
        return null;
    }
}


