package com.java.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args){
        // 获取当前时间:
        Date date = new Date();
        // 格式化时间格式
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        // 日期格式，精确到日
        DateFormat df1 = DateFormat.getDateInstance();
        System.out.println(df1.format(date));
        // 可以精确到时分秒
        DateFormat df2 = DateFormat.getDateTimeInstance();
        System.out.println(df2.format(date));
        // 只显示出时分秒
        DateFormat df3 = DateFormat.getTimeInstance();
        System.out.println("只显示出时分秒:"+df3.format(date));
        // 显示日期，周，上下午，时间(精确到秒)
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        System.out.println("显示日期，周，上下午，时间(精确到秒):"+df4.format(date));
        // 显示日期,上下午，时间(精确到秒)
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        System.out.println("显示日期,上下午，时间(精确到秒):"+df5.format(date));
        // 显示日期，上下午,时间(精确到分)
        DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println("显示日期，上下午,时间(精确到分):"+df6.format(date));
        // 显示日期，时间(精确到分)
        DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        System.out.println("显示日期，时间(精确到分):"+df7.format(date));
    }

}
