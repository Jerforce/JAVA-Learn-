package javalearn.Alist;

import java.util.ArrayList;

/**
*@author Lenovo
*@create 2023/3/27 21:22
**/public class Alist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        //添加元素
        //list.remove("a");
        //指定元素删除

        list.add("b");

        System.out.println(list);

        String s =list.get(0);
        System.out.println(s);
        //查询元素 0 / 1

        String result = list.get(1);
        System.out.println(result);


        System.out.println(list.size());
        System.out.println(list);
        //遍历
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

}
