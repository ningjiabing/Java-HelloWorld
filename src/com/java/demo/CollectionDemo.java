package com.java.demo;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        //Java标准库自带的java.util包提供了集合类：Collection，它是除Map外所有其他集合类的根接口。Java的java.util包主要提供了以下三种类型的集合：
        //List：一种有序列表的集合，例如，按索引排列的Student的List；
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.get(1);
        //Set：一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set；
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.remove("hello");
        set.size();

        //Map：一种通过键值（key-value）查找的映射表集合，例如，根据Student的name查找对应Student的Map。
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }



    }
}
