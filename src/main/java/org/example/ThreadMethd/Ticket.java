package org.example.ThreadMethd;

public class Ticket {
    private String[] array2 = {"apple", "banana", "orange"};
    private    Integer tov=8;

/**
 *
 * 使用synchronized关键字 实现线程同步
 * **/
    public synchronized String getArray2(int i) {
        String s = array2[i];
        System.out.println("shuguo"+s);
        return s;
    }
    public /*synchronized */ Integer getTov() {
       return tov;
    }
    public /*synchronized*/ void SELL(){
        System.out.println("售票。。。");
        if(tov>0){
            tov--;
        }else {
            System.out.println("没票了");
        }

    }

   /* public static void main(String[] args) {




        new Thread(()->{
            System.out.println("-------1-----------");
            Ticket ticket = new Ticket();
            Integer tov1 = ticket.getTov();
             ticket.getTov();
            ticket.SELL();
            ticket.SELL();
            ticket.SELL();
            System.out.println(tov1);
            ticket.SELL();
            System.out.println(ticket.getTov());
            System.out.println("-------1 end-----------");
        }).start();
        new Thread(()->{
            System.out.println("-------2-----------");
            Ticket ticket = new Ticket();
            Integer tov1 = ticket.getTov();
            ticket.SELL();
            ticket.SELL();
            ticket.SELL();    ticket.SELL();
            ticket.SELL();
            System.out.println(tov1);
            ticket.SELL();
            System.out.println(ticket.getTov());
            System.out.println("-------2 end-----------");
        }).start();
    }*/


}
