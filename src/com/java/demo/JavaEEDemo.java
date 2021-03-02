package com.java.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaEEDemo {
    // javaEE是Java Platform Enterprise Edition的缩写，即Java企业平台。我们前面介绍的所有基于标准JDK的开发都是JavaSE，即Java Platform Standard Edition
    // JavaEE并不是一个软件产品，它更多的是一种软件架构和设计思想。我们可以把JavaEE看作是在JavaSE的基础上，开发的一系列基于服务器的组件、API标准和通用架构。
    public static void main(String[] args) {
        Map<String,Object> testMap = new HashMap<>();
        testMap.put("name","ning");
        testMap.put("age","18");

        List<String>  testList = new ArrayList<>();
        testList.add("1");
        testList.add("2");
        testList.add("3");
        System.out.print(testList);

    }
}
