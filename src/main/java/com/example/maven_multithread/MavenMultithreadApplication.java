package com.example.maven_multithread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenMultithreadApplication {

    public static void main(String[] args) {

        MavenMultithreadApplication o = new MavenMultithreadApplication();
        //creating an object for class
//        thread.run();
        MyThread thread = o.new MyThread();
//       Thread thread= new Thread(o.new MyThread()); // using while creating interface
//        thread.start();  //new thread will start executing and a new thread will be created along with a new callstack
        try {

            thread.setDaemon(true); //daemon thread
            thread.start();
            thread.sleep(5000);
            System.out.println("Thread - 0 is running" + thread.isAlive());
            thread.interrupt();// no new thread
            Thread.sleep(5000);
            System.out.println("Thread 0 is " + thread.isAlive());

            Thread.currentThread().isAlive();
        } catch (Exception e) {
            System.out.println("application has stopped forcefully");
            thread.interrupt();

        }
//        Thread.sleep(40000);

    }

    //    implementing thread through java.lang.thread
    public class MyThread extends Thread {
        @Override
        public void run() {
//            System.out.println("in thread " + currentThread().getName());

            try {
                System.out.println("in thread before sleep " + currentThread().getName());

                Thread.sleep(30000);

                System.out.println("in thread after sleep " + currentThread().getName());

            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("Appicatino has stopped forcefully");
            }


        }
    }


    //    now implementing through a runnable interface
//    override all abstract methods while creating interface
//    public class MyThread implements Runnable {
//
//        public void run() {
//            System.out.println("in thread = " + Thread.currentThread().getName());
//
//        }
//    }


}
//daemon thread - basically a bg thread
//ex- java garbage collector(daemon thread_)
//priority - which thread should be executed when (scheduling_)
