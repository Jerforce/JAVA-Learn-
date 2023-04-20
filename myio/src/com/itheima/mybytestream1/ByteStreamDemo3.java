package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
           void write(int b)                       一次写一个字节数据
           void write(byte[] b)                    一次写一个字节数组数据
           void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
           参数一：
                数组
           参数二：
                起始索引  0
           参数三：
                个数      3
        */

        FileOutputStream fout = new FileOutputStream("myio\\b.txt");

        byte[] byte1 = {97, 98, 99, 100, 101,102,103,104,105};

        fout.write(byte1,0,8);


        //1.创建对象
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        //2.写出数据
        //fos.write(97); // a
        //fos.write(98); // b
        byte[] bytes = {97, 98, 99, 100, 101,102,103,104,105};
        /* fos.write(bytes);*/

        fos.write(bytes, 2, 4);// b c
        //从1索引开始写2个字节
        //3.释放资源
        fos.close();


    }
}
