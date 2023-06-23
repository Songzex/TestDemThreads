package org.example.ThreadMethd;

public class Joins {
    /**
     * join()方法主要是用在一个线程被需要另一个线程的执行的结果
     *
     * **/
    static  int a=0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("首先我进入主线程");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                a++;
                System.out.println("我是子线程我在执行。。。。。。" + a);
            }
        });
        t1.start();//启动一下子线程
     /*   t1.join();//等待子线程的进去执行结果*/
        System.out.println("我是主线程子线程结束结果是"+a);
    }

}
