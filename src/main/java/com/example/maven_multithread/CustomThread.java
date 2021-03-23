package com.example.maven_multithread;

public class CustomThread {
    public static void main(String[] args) {
        Animal a1 = new Animal("tom", "cat");
        Animal a2 = new Animal("nob", "tiger");


        //creating 4 thread
//        Each object 2 threads
        //threads for a1 object
        MyThread thread1 = new MyThread(a1);
        MyThread thread2 = new MyThread(a1);


        //threads for a2 object
        MyThread thread3 = new MyThread(a2);
        MyThread thread4 = new MyThread(a2);

        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
    }

    private static class MyThread extends Thread {

        Animal animal;

        public MyThread(Animal animal) {
            this.animal = animal;
        }

        @Override
        public void run() {
            //added whole code in a lock
// through class   //class level lock
            synchronized (Animal.class) {
//            synchronized (this.animal) {  //through object    //object level lock
                //critical{hypothetical section starts}
                System.out.println("current thread = " + currentThread().getName() + " , animal = " + this.animal + " thread object location = " + this);

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            //ends
        }
    }
}
//order of thread may change due to core...