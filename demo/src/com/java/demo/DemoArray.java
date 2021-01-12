package com.java.demo;

import java.util.*;

public class DemoArray {
    public static void main(String[] args) {

        int[] ns = { 1, 4, 9, 16, 25 };

        // 遍历数组
        for (int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }

        for (int n : ns) {
            System.out.println(n);
        }

        //快速打印数组内容
        System.out.println(Arrays.toString(ns));


    }
}
