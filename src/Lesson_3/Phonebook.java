package Lesson_3;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
//        номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
//        однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

//        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять
//        еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
//        Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main()
//        прописывая add() и get().
        Logic logic = new Logic();
        logic.add("Иван", "89770001122");
        logic.add("Иван", "89770001121");
        logic.add("Иван", "89770001122");
        logic.add("Алексей", "89770051122");
        logic.add("Алексей", "89770051122");
        logic.add("Алексей", "89780051122");
        logic.add("Михаил", "89770001126");
        logic.add("Диана", "89770101122");
        System.out.println(logic.get("Диана"));
    }
}

class Logic {
    Map<String, Set<String>> map = new HashMap<>();
    public Set<String> setString;

    public void add(String name, String telNum) {
        if (map.containsKey(name)) {
            setString = map.get(name);
        } else {
            setString = new HashSet<>();
        }
        setString.add(telNum);
        map.put(name, setString);
    }

    public Set<String> get(String name) {
        return map.get(name);
    }
}
