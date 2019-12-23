package Lesson_5;

public class Box {

    Object object = new Object();

    void doSomeThing() {
        System.out.println(1);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (object) {
            System.out.println(201);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(202);
        }

        System.out.println(2);
    }
}

class MainBox {
    public static void main(String[] args) {
        Box box = new Box();

        new Thread(new Runnable() {
            @Override
            public void run() {
                box.doSomeThing();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                box.doSomeThing();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                box.doSomeThing();
            }
        }).start();
    }
}
