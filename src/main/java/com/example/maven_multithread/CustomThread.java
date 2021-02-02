package com.example.maven_multithread;

public class CustomThread {
    public static void main(String[] args) {
        Animal a1 = new Animal("tom", "cat");
        Animal a2 = new Animal("nob", "tiger");
    }

    private static class MyThread extends Thread {


        @Override
        public void run() {

        }
    }
}
