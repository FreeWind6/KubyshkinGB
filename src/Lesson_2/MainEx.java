package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainEx {
    public static void main(String[] args) {


//        int a,b;
//
//        try {
//            int[] res= {1,2,3};
//            System.out.println(1);
//            b = 10 / 0;
//            System.out.println(2);
//            res[10] = 20;
//        } catch (Exception e) {
//            System.out.println("Вышли за пределы массива!");
//        }

//        catch (ArithmeticException e) {
//            System.out.println("Деление на ноль!");
//
////            try {
////                int[] res= {1,2,3};
////                res[10] = 20;
////            } catch (ArrayIndexOutOfBoundsException e1) {
////                System.out.println("Вышли за пределы массива!");
////            }
//        }

//        try {
//            a();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

      //  throw new RuntimeException("ошибка!");
       // System.out.println("END!");

//        FileInputStream fileInputStream = new FileInputStream("1.txt");
//
//        a(fileInputStream);
//        b(fileInputStream);
//        c(fileInputStream);

       // System.out.println(doSomthing());

//        try (FileInputStream fileInputStream = new FileInputStream("1.txt")) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

//    public static int doSomthing() {
//        try {
//            return 1;
//        } catch (FileNotFoundException e1) {
//            e1.printStackTrace();
//        } catch (ArithmeticException e) {
//            try {
//
//            }
//            e.printStackTrace();
//        }  finally {
//            return 2;
//        }
//    }


    public static int sqrt(int n) {
        if (n > 0){
            return n/2;
        }
        throw new ArithmeticException("нельзя отрицательное!");
    }

//
    public static void a(FileInputStream fileInputStream) throws FileNotFoundException {
        fileInputStream = new FileInputStream("1.txt");
    }

    public static void b(FileInputStream fileInputStream) throws FileNotFoundException {
        fileInputStream = new FileInputStream("1.txt");
    }

    public static void c(FileInputStream fileInputStream) throws FileNotFoundException {
        fileInputStream = new FileInputStream("1.txt");
    }
//
//    public static void b() {
//        c();
//    }
//
//    public static void c() {
//        int a = 0;
//        int b = 10 / a;
//    }
}
