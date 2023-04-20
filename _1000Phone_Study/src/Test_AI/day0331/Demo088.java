package Test_AI.day0331;

import java.util.Objects;

/**
 * @author Jerforce
 * @date 2023/4/8 星期六 16:30:14
 */
public class Demo088 {
    // Employee class with id, name, and age properties
    static class Employee {
        private int id;
        private String name;
        private int age;

        public Employee(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Employee employee)) return false;
            return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }

        // Override toString method
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


    } public static void main(String[] args) {
        Employee e1 = new Employee(1, "Tom", 20);
        Employee e2 = new Employee(1, "Tom", 20);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e1.equals(e2));
    }
}
