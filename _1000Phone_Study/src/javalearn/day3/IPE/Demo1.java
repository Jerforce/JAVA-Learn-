package javalearn.day3.IPE;

/**
 * @author Lenovo
 * @create 2023/3/24 16:47
 **/
public class Demo1 {
    // 面对对象具备三大·特征：封装，继承，多态
    /*
    * public  表公有，任何地方都可以访问
    * private 表私有，只在本类中可以访问
    * */

    public class Student {
        private String name;
        private int age;
        String sex;//性别
        public void setName(String name) {
            this.name = name;
        }
        //setter for the age/name
        public void setAge(int age) {
            if (age > 0 && age < 160) {
                this.age = age;
            } else {
                this.age = 18;
            }
        }
        //getter for the age/name

        public int getAge() {
             return  this.age;
        }

        public String getName() {
            if(this.name == null) {
                this.name = "无名";
            }
            return this.name;
        }


    }

}
