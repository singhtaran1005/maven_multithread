package com.example.maven_multithread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenMultithreadApplication {

    public static void main(String[] args) {
    //creating an object for class
        MyThread thread =new MyThread();
        thread.start();  //now thread will start executing nd a new thread will be created along with a new callstack
//        thread.run(); // no new thread

    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("in thread" + currentThread().getName());
        }
    }

}
//daemon thread - basically a bg thread
//priority - which thread should be executed when (scheduling_)
