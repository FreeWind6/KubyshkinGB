package Lesson_1;

public class BoxTest {
    String color;
    int weigth;
    String name;

    public BoxTest(String color, int weigth, String name) {
        this.color = color;
        this.weigth = weigth;
        this.name = name;
    }

    public BoxTest(String color, int weigth) {
        this.color = color;
        this.weigth = weigth;
    }

    public void info() {
        System.out.println(color + " " + weigth + " " + name);
    }
}

class TestMain {
    static int c = 10;
    public static void main(String[] args) {
//        BoxTest boxTest1 = new BoxTest("test1", 10, "red");
//        BoxTest boxTest2 = new BoxTest("test2", 15, "black");
//        boxTest1.info();
//        boxTest2.info();

        //sum(2);
        TestMain testMain = new TestMain();
        testMain.abc();
    }

    void abc() {
        System.out.println("abc");
    }

//    public static void sum(int... a) {
//        int res = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            res += a[i];
//        }
//
//        System.out.println(res);
//    }

//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void sum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void sum(int a, int b, int c, int y) {
//        System.out.println(a + b + c + y);
//    }
}
