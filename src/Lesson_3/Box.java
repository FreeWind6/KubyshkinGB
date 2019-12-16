package Lesson_3;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }
}

class MainBox{
    public static void main(String[] args) {
        Box box1 = new Box("red", 1);
        Box box2 = new Box("red", 1);

        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2));
    }
}