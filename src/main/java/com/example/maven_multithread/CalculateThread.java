package com.example.maven_multithread;

import java.math.BigInteger;

public class CalculateThread {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        long start = System.currentTimeMillis();
        //10+15+25sec
        t1.start();//10sec
        t2.start();//15sec


        t1.join(); //10sec
        t2.join(); //5sec

        //time taken  = max(t(i)); =40sec
        //time taken = sum(t(i));

        System.out.println(t1.result - t2.result);

        long end = System.currentTimeMillis();

    }

    private static class MyThread extends Thread {

        private int result;    //->(not keep it volatile)

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        @Override
        public void run() {

        }
    }
}


//finding sum of squares of even nd odd