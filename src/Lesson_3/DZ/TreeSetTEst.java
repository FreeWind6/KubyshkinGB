package Lesson_3.DZ;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTEst {
    public static void main(String[] args) {

//        TreeSet<Integer> ts = new TreeSet<>();
//
//        ts.add(5);
//        ts.add(3);
//        ts.add(1);
//        ts.add(2);
//
//        System.out.println(ts);

//        TreeSet<Empl> ts = new TreeSet<>();
//
//        ts.add(new Empl("Aa1", 10));
//        ts.add(new Empl("Aa2", 20));
//        ts.add(new Empl("Aa3", 30));
//
//        System.out.println(ts);







        TreeSet<Empl> ts = new TreeSet<>(new MySalary());

        ts.add(new Empl("Ram", 2000));
        ts.add(new Empl("Sofia", 1000));
        ts.add(new Empl("Cris", 3000));
        ts.add(new Empl("Ivan", 5000));
//
        for (Empl e: ts) {
            e.info();
        }
    }
}

class MySalary implements Comparator<Empl> {

    @Override
    public int compare(Empl o1, Empl o2) {
        return o2.getSalary() - o1.getSalary();
    }
}

class Empl {
    private String name;

    public int getSalary() {
        return salary;
    }

    private int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void info() {
        System.out.println(name + " " + salary);
    }
}
