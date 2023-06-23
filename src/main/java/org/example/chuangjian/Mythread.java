package org.example.chuangjian;

public class Mythread  extends  Thread{
    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<4;i++){
            System.out.println(1);
        }
    }
}
