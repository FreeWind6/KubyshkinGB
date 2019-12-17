package Lesson_3;

import java.util.*;

public class Words {

    public static void main(String[] args) {
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
}
