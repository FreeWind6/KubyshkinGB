package Lesson_5;

public class MainClassThread {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(new MyRunnableClass());
//        Thread t2 = new Thread(new MyRunnableClass());
//
//        t1.start();
//        t2.start();

        long tt1 = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        long tt2 = System.currentTimeMillis();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(2);
            }
        });

        long tt3 = System.currentTimeMillis();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(3);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        long current = System.currentTimeMillis();
        System.out.println("t1 " + (current - tt1) + " t2 " + (current - tt2) + " t3 " + (current - tt3));

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END");
    }

}

class MyRunnableClass implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}