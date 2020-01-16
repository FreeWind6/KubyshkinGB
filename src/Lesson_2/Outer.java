package Lesson_2;

public class Outer {
    private int outerVar;

    class Inner {
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }

        void innerTest() {
            System.out.println(innerVar + " " + outerVar);
        }
    }

    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

//    void outerTest() {
//        System.out.println(innerVar + " " + outerVar);
//    }
}

class MainOuterAndInner {
    public static void main(String[] args) {
        Outer outer = new Outer(1);

        Outer.Inner inner = new Outer(1).new Inner(2);
    }
}
