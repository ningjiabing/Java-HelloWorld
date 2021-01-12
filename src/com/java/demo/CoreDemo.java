package com.java.demo;

import java.util.StringJoiner;

public class CoreDemo {

    // 通过static final来定义常量
    public static final int SUN = 0;

    // 通过enum定义的枚举类
    public enum Color {
        RED, GREEN, BLUE;
    }

    // Java核心类
    public static void main(String[] args) {

        // String
        // 在Java中，String是一个引用类型，它本身也是一个class。但是，Java编译器对String有特殊处理

        // 当我们想要比较两个字符串是否相同时，要特别注意，我们实际上是想比较字符串的内容是否相同。必须使用equals()方法而不能用==。
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

        // 两个字符串比较，必须总是使用equals()方法。
        // equalsIgnoreCase()   忽略大小写比较
        // 是否包含子串:
        "Hello".contains("ll"); //  true

        // 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
        "Hello".indexOf("l"); // 2

        // 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
        "Hello".lastIndexOf("l"); // 3

        // 用于检测字符串是否以指定的前缀开始。
        "Hello".startsWith("He"); // true

        // 用于测试字符串是否以指定的后缀结束。
        "Hello".endsWith("lo"); // true

        // 返回字符串的子字符串。
        "Hello".substring(2); // "llo"
        "Hello".substring(2, 4); // "ll"

        // 去除首尾空白字符  使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n：
        // 另一个strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
        "  \tHello\r\n ".trim(); // "Hello"

        // String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：
        "".isEmpty(); // true，因为字符串长度为0
        "  ".isEmpty(); // false，因为字符串长度不为0

        // 要在字符串中替换子串，有两种方法。一种是根据字符或字符串替换：
        String s = "hello";
        s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"

        // 分割字符串，使用split()方法 传入的是正则表达式
        String a = "A,B,C,D";
        String[] ss = a.split("\\,"); // {"A", "B", "C", "D"}

        // 拼接字符串使用静态方法join()，它用指定的字符串连接字符串数组
        String[] arr = {"A", "B", "C"};
        String sss = String.join("***", arr); // "A***B***C"

        // 格式化字符串
        // 字符串提供了formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串
        String st = "Hi %s, your score is %d!";
        // System.out.println(st.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
        // 有几个占位符，后面就传入几个参数。参数类型要和占位符一致。我们经常用这个方法来格式化信息。常用的占位符有：
        // %s：显示字符串；
        // %d：显示整数；
        // %x：显示十六进制整数；
        // %f：显示浮点数。

        // 类型转换
        // 要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c
        // 把字符串转换为int类型
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        // 把字符串转换为boolean类型：
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false

        // String和char[]类型可以互相转换，方法是
        char[] cs = "Hello".toCharArray(); // String -> char[]
        String ssss = new String(cs); // char[] -> String

        // StringBuilder
        // 为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象：
        StringBuilder str = new StringBuilder("开头");
        str.append("拼接中间");
        str.append("拼接结尾");

        // StringBuilder
        // 类似用分隔符拼接数组的需求很常见，所以Java标准库还提供了一个StringJoiner来干这个事
        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
        // String.join()
        // String还提供了一个静态方法join()，这个方法在内部使用了StringJoiner来拼接字符串，在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
        String[] namess = {"Bob", "Alice", "Grace"};
        String sa = String.join(", ", namess);

    }
}
