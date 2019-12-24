/*
1. Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:

static final int size = 10000000;
static final int h = size / 2;
float[] arr = new float[size];

2) Заполняют этот массив единицами;
3) Засекают время выполнения: long a = System.currentTimeMillis();
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis();
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:

System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки:

System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);

Примечание:
System.arraycopy() – копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:

for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}

Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
*/

package Lesson_5.HW;

import java.util.Arrays;

public class HW {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        float[] arr1 = new float[size];
        float[] arr2 = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        method1(arr1);
        method2(arr2, a1, a2);
//        System.out.println(Arrays.toString(arr2));
    }

    private static void method1(float[] arr1) {
        fillArray(arr1);

        long start1 = System.currentTimeMillis();
        calculationCycle(arr1);
        long stop1 = System.currentTimeMillis();

        long finish1 = stop1 - start1;
        System.out.println("Время выполения" + ANSI_GREEN + " без потоков " + ANSI_RESET + finish1 + " миллисекунд");
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
        System.out.println("Время выполения" + ANSI_GREEN + " с потоками " + ANSI_RESET + finish2 + " миллисекунд");
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

    private static void divideArray(float[] arr, float[] a1, float[] a2) {
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
    }

    private static void returnArray(float[] arr, float[] a1, float[] a2) {
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }
}
