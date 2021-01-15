package com.java.demo;

public class MyRunnable implements Runnable {
    @Override
    public void run(){

        //线程同步
        // synchronized保证了代码块在任意时刻最多只有一个线程能执行。
        // 找出修改共享变量的线程代码块；
        // 选择一个共享实例作为锁；
        // 使用synchronized(lockObject) { ... }。
        // 在使用synchronized的时候，不必担心抛出异常。因为无论是否有异常，都会在synchronized结束处正确释放锁：

        for (int i=0; i<10000; i++) {
            synchronized(Counter.lock) {
                Counter.count += 1;
            }
        }
        System.out.println("start new thread!");
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}