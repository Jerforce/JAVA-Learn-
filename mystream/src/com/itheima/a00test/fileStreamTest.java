package com.itheima.a00test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 20:17:19
 */
public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bytes = {11,22,3,6,1,8};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bytes.length; i++) {
                os.write(bytes[i]);
            }
            os.close();
            InputStream is= new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char)is.read()+"");

            }
            is.close();


        }catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
