package com.itheima.a08objectclonedemo;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 19:55:53
 */

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass myClass = new MyClass(1.1);
        MyClass myClass2 = (MyClass) myClass.clone();
        System.out.println(myClass.getValue());
        System.out.println(myClass2.getValue());


        myClass.setValue(820.523);
        System.out.println(myClass.getValue());
        myClass2.setValue(800.523);
        System.out.println(((MyClass) myClass.clone()).getValue());


    }


    static class MyClass implements Cloneable {
        private double value;

        public MyClass(double value) {
            this.value = value;
        }

        public MyClass() {
        }

        /**
         * 获取
         *
         * @return value
         */
        public double getValue() {
            return value;
        }

        public Object clone() {
            MyClass copy = null;
            try {
                copy = (MyClass) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return copy;

        }

        /**
         * 设置
         * @param value
         */
        public void setValue(double value) {
            this.value = value;
        }

        public String toString() {
            return "MyClass{value = " + value + "}";
        }
    }
}

