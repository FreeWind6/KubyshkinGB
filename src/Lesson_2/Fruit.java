package Lesson_2;

public enum Fruit {
    ORANGE("Апельсин",2), APPLE("Яблоко",3), BANANA("Банан",3), CHERRY("Вишня",7);

    private String rus;
    private int weight;

    public String getRus() {
        return rus;
    }

    public int getWeight() {
        return weight;
    }

    Fruit(String rus, int weight) {
        this.rus = rus;
        this.weight = weight;
    }
}

class MainEnum {
    public static void main(String[] args) {
//        Fruit f = Fruit.APPLE;
//
//        if (f == Fruit.APPLE) {
//            System.out.println("Яблоко!");
//        }

        for (Fruit o: Fruit.values()) {
            System.out.println(o + " " + o.getRus());
        }

//        System.out.println(Fruit.valueOf("BANANA"));

      //  System.out.println(Fruit.APPLE.ordinal());
    }
}