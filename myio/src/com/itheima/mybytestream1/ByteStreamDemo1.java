package com.itheima.mybytestream1;


import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       写出数据
         *       释放资源
         * */


        //1.创建对象
        //写出 输出流 OutputStream
        //本地文件    File
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        FileOutputStream fout = new FileOutputStream("myio\\b.txt");
        //2.写出数据
        fout.write(97);


        fos.write(97);
        //  ASCLL码 ’a‘==》 97
        //3.释放资源
        fos.close();


    }
}