package org.example.pool;


import com.beust.jcommander.internal.Lists;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestInvokeAnyMethod {
    @Test
    public void  Test() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> newArrayList = Lists.newArrayList(
                new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("我是任务1。。。。。。。。。。。。。。。。。");
                return 1;
            }
        },
                new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("我是任务2。。。。。。。。。。。。。。。。。");
                try {
                    Thread.sleep(10000);
                    System.out.println("我是2");
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("2任务异常");
                }
                return 2;
            }
        });

        Integer any = pool.invokeAny(newArrayList);//invokeAny是两个 任务要么都执行 要么都不执行 至少执行一个
        System.out.println("执行任务结果是"+any);


    }









}
