package org.example.pool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SinglepoolTest {

    /**
     * 创建一步任务的执行类
     * **/
public static final  int SLEEP_GAP=500;
/**创建任务类**/
static   class   TargetTask implements  Runnable{
         /**
          *
          * **/
         static  AtomicInteger task= new AtomicInteger(1);
         private String  name;
         public TargetTask(){
               name="task"+task.get();
               task.incrementAndGet();
         }
    public void run() {
        System.out.println("任务"+name+"donging");
        System.out.println("结束");
    }
}

   @Test
   public void  Test(){
       ExecutorService pool = Executors.newSingleThreadExecutor();
            for (int i=0;i<5;i++){
                pool.execute(new TargetTask());
                pool.submit(new TargetTask());
            }
            pool.shutdown();//

   }


















}
