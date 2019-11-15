package com.jiaxi.gatewayzulldemo;

public class Hello {
    public static void main(String[] args) {
        Runnable  run = new Runnable(){
            @Override
            public void run() {
                while (true) {

                    System.out.println("Thread Name:" + Thread.currentThread().getName());

                }
            }
        };
        Thread thread = new Thread(run);
        thread.start();

    }

}
