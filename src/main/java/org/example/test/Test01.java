package org.example.test;

import org.example.chuangjian.MyThread02;
import org.example.chuangjian.Mythread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();//继承thread的
        Runnable MyThread02=new MyThread02();
        Thread t3 = new Thread(MyThread02);
        t3.start();//实现runnable接口
        new Thread(new Runnable() {//匿名内部类的创建方式
            @Override
            public void run() {
                System.out.println("hello");
                try {
                    Thread.sleep(1000000);
                    System.out.println("hellop");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        Thread t1 = new Thread(() -> {
            System.out.println("我是lambda表达式的形式传建");
        });//lambda表达式的形式创建
        ExecutorService pool = Executors.newFixedThreadPool(7);//从线程中获取
        Future<?> future = pool.submit(t3);//提交任务
        pool.execute(t3);
    /*    //取出来一个线程
        System.out.println("获取线程"+future);*/
        pool.shutdown();//关闭线程
    }
}
