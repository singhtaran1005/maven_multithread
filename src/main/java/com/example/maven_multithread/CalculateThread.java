package com.example.maven_multithread;

import java.math.BigInteger;

public class CalculateThread {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
       System.out.println(t1.result-t2.result);

    }
    private static class MyThread extends Thread {

        private  int result;    //->(not keep it volatile)

//        public MyThread(Animal animal) {
//            this.animal = animal;
//        }

        @Override
        public void run() {




        }
    }
}


//finding sum of squares of even nd odd