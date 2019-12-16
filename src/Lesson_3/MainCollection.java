package Lesson_3;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[20];
//        System.arraycopy(arr, 0, arr2, 0, arr.length);
//        System.out.println(Arrays.toString(arr2));

//        ArrayList<Integer> al = new ArrayList<>();
//        al.ensureCapacity(100000);
//
//        System.out.println(al.size());
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        System.out.println(al.size());
//        al.add(4);
//        al.add(5);
//        System.out.println(al.size());
//
//        al.trimToSize();
//
//        al.remove((Integer) 5);
//
//        if (al.contains(8)) {
//            System.out.println("есть 5");
//        }
//
//        System.out.println(al);


//        ArrayList<String> states = new ArrayList<>();
//
//        states.add("Германия");
//        states.add("Германия");
//        states.add("Франция");
//        states.add("Италия");
//        states.add("США");
//        states.add("Россия");
//
//        Iterator<String> iter = states.iterator();
//
//        ListIterator<String> iterList = states.listIterator();

//        while (iterList.hasPrevious()) {
//            if (iter..equalsIgnoreCase("Германия")) {
//                iter.remove();
//            }
//            // System.out.println(iter.next());
//        }

//        while (iter.hasNext()) {
////            if (iter.next().equalsIgnoreCase("Германия")) {
////                iter.remove();
////            }
//            System.out.println(iter.next());
//        }

//        for (int i = 0; i < states.size(); i++) {
//            if (states.get(i).equalsIgnoreCase("Германия")) {
//                states.remove(i);
//                i--;
//            }
//        }

//        System.out.println(states);

//        LinkedList<String> ll = new LinkedList<>();
//
//        ll.add("a");
//        ll.add("b");
//        ll.add("c");
//        ll.addLast("z");
//
//        System.out.println(ll);


//        Map<String, Integer> hm = new HashMap<>();
//        hm.put("Васька", 6);
//        hm.put("Мурзик", 3);
//        hm.put("Рыжик", 2);
//        hm.put("Васька", 1);

      //  System.out.println(hm);
//        Map<String, Integer> hm = new HashMap<>();
//
//        hm.put("Васька", 6);
//        hm.put("Мурзик", 3);
//        hm.put("Рыжик", 2);
//        hm.put("Васька", 1);
//
//        Set<Map.Entry<String, Integer>> set = hm.entrySet();
//
//        for (Map.Entry<String, Integer> me : set) {
//            System.out.print(me.getKey() + " ");
//            System.out.println(me.getValue());
//        }

//        Map<Integer, ArrayList<String>> hm1 = new HashMap<>();
//
//        Random random = new Random();
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int i = 0; i < 100; i++) {
//            int num = random.nextInt(10);
//            Integer current = hm.get(num);
//            hm.put(num, current == null ? 1 : current + 1);
//        }
//
//        System.out.println(hm);

//        HashSet<String> hs = new HashSet<>();
//
//        hs.add("в");
//        hs.add("б");
//        hs.add("а");
//
//        System.out.println(hs);

        int key = 779;

        HashMap<Integer, String> map = init();
        System.out.println(map.getOrDefault(key, "not found!"));
    }

    static HashMap<Integer, String> init() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(771, "test1");
        map.put(772, "test2");
        return map;
    }

}
