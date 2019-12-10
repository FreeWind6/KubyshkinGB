package Lesson_1;

public abstract class Animal {
    abstract void run(int a, int b);
//    private int a;
//    protected int z;
//
//    public Animal(int a, int z) {
//      //  System.out.println("Animal");
//        this.a = a;
//        this.z = z;
//    }
//
//    void info() {
//        System.out.println("Animal");
//    }
}

class Cat extends Animal {
    @Override
    void run(int a, int b) {

    }

//    protected int y;
//
//    public Cat(int a, int z, int y) {
//        super(a, z);
//        this.y = y;
//       // System.out.println("Cat");
//    }
//
//    @Override
//    void info() {
//        System.out.println("Cat");
//    }
}

class SuperCat extends Cat {

//    int u;
//    public SuperCat(int a, int z, int y, int u) {
//        super(a, z, y);
//        this.u = u;
//        //System.out.println("SuperCat");
//    }
//
//    void info() {
//        super.info();
//       // System.out.println("SuperCat");
//    }
}

class MainAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal(1,2);
//        Cat cat = new Cat(1,2,3);
//        SuperCat superCat =  new SuperCat(1,2,3,4);
//        //SuperCat superCat = new SuperCat(1,2,3,4);
//        BoxTest boxTest = new BoxTest("sdf",1);
//
//        Animal[] animals = {animal, cat, superCat};
//
//        for (Animal animal111:animals) {
//            animal111.info();
//        }
    }
}

