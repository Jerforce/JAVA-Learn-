package com.itheima.mycharset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\b.txt");
        //2.拷贝
        /*int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        //3.释放资源
        fos.close();
        fis.close();*/
        long start = System.currentTimeMillis();
        try(fis;fos) {
           byte [] bytes = new byte[100000];
           int len = fis.read(bytes);
           while (len != -1) {
               fos.write(bytes, 0, len);
               len = fis.read(bytes);
           }
        }catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}
