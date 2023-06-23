package org.example.pool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newFixedThreadPool {

    static  class  task implements  Runnable{
      private  final  int taskId;

        task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " +taskId+ " executed by: " + Thread.currentThread().getName());
            // 执行任务的逻辑
            System.out.println("我在做任务");
        }
    }





    @Test
    public void  Test(){
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++){
            threadPool.execute(new task(i));
        }

    }










}
