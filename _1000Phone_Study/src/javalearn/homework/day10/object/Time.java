package javalearn.homework.day10.object;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lenovo
 * @create 2023/3/28 22:38
 **/
public class Time  {
    public static void main(String[] args) {
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));
    }



    }


