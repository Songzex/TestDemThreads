package org.example.ThreadMethd;

import java.util.Scanner;

public class Deaths {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主开始........");

        Thread t1 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
             String name=scanner.nextLine();
            String finalName = name;
            while (!finalName.equals("exit")) {
                for (int i = 0; i < 2; i++) {
                    try {
                        Thread.sleep(100);
                       finalName = scanner.nextLine();


                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("我是子线程我在执行。。。。。。");
                }
            }
            System.out.println("子结束......");
        });
        t1.start();//开启


        System.out.println("主结束.....");
    }
}
