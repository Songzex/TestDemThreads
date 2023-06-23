package org.example.zhuanzhang;

public class Test {

    public static void main(String[] args) {
        Account a = new Account(100,"A");
        Account b = new Account(100,"B");
        Account c = new Account(100,"C");
        new Thread(()->{

                a.transfer(b, 100);

        }).start();
        new Thread(()->{

                b.transfer(c, 100);

        }).start();
        int aBlance = a.getBlance();
        System.out.println("a   "+aBlance);
        int bBlance = b.getBlance();
        System.out.println("b    "+bBlance);
        int i = c.getBlance();
        System.out.println("c    "+i);
    }


}
