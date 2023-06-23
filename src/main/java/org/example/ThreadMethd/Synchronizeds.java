package org.example.ThreadMethd;

public class Synchronizeds {
    public static void main(String[] args) {
        System.out.println("开始售票");
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(() -> {

        while (true) {
            synchronized (ticket) {
                Integer tov = ticket.getTov();
                System.out.println("目前一共有" + " " + tov + "张票");
                if (tov <= 0) {
                    System.out.println("t1无票了 无法购买");
                    break;
                } else {
                    System.out.println("t1" + "开始售票");
                    ticket.SELL();
                }

            }
        }

        });
        t1.start();
        Thread t2 = new Thread(() -> {
            while (true){
                synchronized (ticket){
                Integer tov = ticket.getTov();
                System.out.println("目前一共有"+" "+tov+"张票");
                System.out.println("t2发现还有"+" "+tov+"张票");
                if (tov<=0){
                    System.out.println("t2无票了无法购买");
                    break;
                }else {
                    System.out.println("t2"+"开始售票");
                    ticket.SELL();
                }

            }}
        });
        t2.setPriority(Thread.MAX_PRIORITY);
       t2.start();
    }
}
