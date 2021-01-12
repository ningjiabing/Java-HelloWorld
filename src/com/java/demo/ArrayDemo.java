package com.java.demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        // 遍历数组
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        for (int n : ns) {
            System.out.println(n);
        }

        //快速打印数组内容
        System.out.println(Arrays.toString(ns));

        //练习:
        //请按倒序遍历数组并打印每个元素：
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }
}
