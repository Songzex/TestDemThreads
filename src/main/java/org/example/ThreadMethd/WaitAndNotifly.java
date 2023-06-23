package org.example.ThreadMethd;

public class WaitAndNotifly {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread t1 = new Thread(() -> {
                  synchronized (lock){
                      System.out.println("t1在做这些东西呢？，，，，，，，");
                      try {
                          lock.wait(); // 线程等待，释放lock的锁
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                  }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t2你好在执行呢，，，，，");
                System.out.println("ing.......唤醒一个");
                lock.notify(); // 唤醒一个等待在lock上的线程
            }
        });
        t2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }










}
