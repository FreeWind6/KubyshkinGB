package Lesson_5.HW;

import java.util.Arrays;

public class HW {
    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        float[] arr1 = new float[size];
        float[] arr2 = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        method1(arr1);
        method2(arr2, a1, a2);
    }

    private static void method1(float[] arr1) {
        fillArray(arr1);

        long start1 = System.currentTimeMillis();
        calculationCycle(arr1);
        long stop1 = System.currentTimeMillis();

        long finish1 = stop1 - start1;
        System.out.println("Время выполения без потоков " + finish1 + " миллисекунд");
//        System.out.println(Arrays.toString(arr1));
    }

    private static void method2(float[] arr2, float[] a1, float[] a2) {

        fillArray(arr2);

        long start2 = System.currentTimeMillis();
        //разбиваем массив
        divideArray(arr2, a1, a2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculationCycle(a1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculationCycle(a2);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        //восстанавливаем массив
        returnArray(arr2, a1, a2);
        long stop2 = System.currentTimeMillis();
        long finish2 = stop2 - start2;
        System.out.println("Время выполения с потоками " + finish2 + " миллисекунд");
//        System.out.println(Arrays.toString(arr2));
    }

    private static void fillArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    private synchronized static void calculationCycle(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

/*    private synchronized static void calculationCycle2(float[] arr) {
        for (int i=0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }*/

    private static void divideArray(float[] arr, float[] a1, float[] a2) {
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
    }

    private static void returnArray(float[] arr, float[] a1, float[] a2) {
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }
}
