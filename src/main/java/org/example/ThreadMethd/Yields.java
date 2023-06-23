package org.example.ThreadMethd;

public class Yields {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i=0;i<3;i++){
                System.out.println("zhi"+i);
                /**yield() 是让步给其他线程 自己进入休眠状态 回到就绪状态 只会让给同级线程和高级的
                 * **/
                Thread.yield();//
                try {
                    /**让步给其他线程 自己进入休眠状态 回到就绪状态   让步给所有的线程
                     *
                     * **/
                    Thread.sleep(100);//
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        });





    }


}
