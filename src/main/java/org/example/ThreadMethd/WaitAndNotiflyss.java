package org.example.ThreadMethd;

public class WaitAndNotiflyss {

    static class Worker {
        private boolean jobDone = false;

        public synchronized void doWork() {
            // 模拟一些操作
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            jobDone = true;
            notify(); // 唤醒等待的线程
        }

        public synchronized void waitForWork() {
            while (!jobDone) {
                try {
                    System.out.println(
                            "等待一下这个工作者完成目前没完成"
                    );
                    wait(); // 等待工作完成，并释放对象锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Work is done!");
        }
    }


    }