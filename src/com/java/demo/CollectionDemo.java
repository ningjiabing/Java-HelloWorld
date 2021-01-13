package com.java.demo;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        // Java标准库自带的java.util包提供了集合类：Collection，它是除Map外所有其他集合类的根接口。Java的java.util包主要提供了以下三种类型的集合：
        // List：一种有序列表的集合，例如，按索引排列的Student的List；
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.get(0);
        // Set：一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set；
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.remove("hello");
        set.size();

        // Map：一种通过键值（key-value）查找的映射表集合，例如，根据Student的name查找对应Student的Map。
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.get("apple");
        // 查询某个key是否存在，可以调用boolean containsKey(K key)方法。
        map.containsKey("apple");
        //  循环Map
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        // Queue
        // 队列（Queue）是一种经常使用的集合。Queue实际上是实现了一个先进先出（FIFO：First In First Out）的有序表。它和List的区别在于，List可以在任意位置添加和删除元素，而Queue只有两个操作：
        // 把元素添加到队列末尾；
        // 从队列头部取出元素。

        // int size()：获取队列长度；
        // boolean add(E)/boolean offer(E)：添加元素到队尾；
        // E remove()/E poll()：获取队首元素并从队列中删除；
        // E element()/E peek()：获取队首元素但并不从队列中删除。
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        System.out.println(q.poll()); // apple

        // Stack
        // 栈（Stack）是一种后进先出（LIFO：Last In First Out）的数据结构。
        // Stack只有入栈和出栈的操作：
        // 把元素压栈：push(E)；
        // 把栈顶的元素“弹出”：pop(E)；
        // 取栈顶元素但不弹出：peek(E)

        // Iterator : 迭代器
        // 使用迭代器的好处在于，调用方总是以统一的方式遍历各种集合类型，而不必关系它们内部的存储结构。
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
