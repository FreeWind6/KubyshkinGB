package Lesson_3;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        taskOne();

        System.out.println();
        System.out.println("Задание 2");
        taskTwo();
    }

    private static void taskOne() {
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
// слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
        ArrayList<String> states = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        states.add("Германия");
        states.add("Франция");
        states.add("Германия");
        states.add("Италия");
        states.add("Италия");
        states.add("Россия");
        states.add("США");
        states.add("США");
        states.add("США");
        states.add("США");
        states.add("Россия");
        states.add("Италия");
        states.add("Россия");
        states.add("Австрия");
        states.add("Великобритания");

//        System.out.println(states);

        for (int i = 0; i < states.size(); i++) {
            Integer current = map.get(states.get(i));
            map.put(states.get(i), current == null ? 1 : current + 1);
        }
        System.out.println(map);
    }

    private static void taskTwo() {
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
//        номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
//        однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

//        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять
//        еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
//        Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main()
//        прописывая add() и get().
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList1.add("8977887402" + i);
            arrayList2.add("8977555" + i + "402");
            arrayList3.add("891575840" + i + "3");
        }

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("Иванов", arrayList1);
        map.put("Петров", arrayList2);
        map.put("Сидоров", arrayList3);

        System.out.println(map.get("Петров"));
    }
}
