package com.itheima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 20:12:01
 */
public class BRreader {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Starting input reader: when input q quit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
