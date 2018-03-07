package com.company;

import java.util.*;

//List is a datastructure which includes LinkedList and ArrayList
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
//      Can also declared as List and instantiated with the appropriate list
//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();

//        doTimings("ArrayList", arrayList);
//        doTimings("LinkedList", linkedList);


//        SortedMap sorted1 = new SortedMap();
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        sorted1.testMap(hashMap);
//        sorted1.testMap(linkedHashMap);

        Sets.checkSets();
    }

    private static void doTimings(String type, List<Integer> list) {
//        for(int i = 0; i < 500000; i++ ) {
//            list.add(i);
//        }

        long start = System.currentTimeMillis();

//        add item on list and see the time
//        for(int i = 0; i < 500000; i++) {
//            list.add(i);
//        }

//        add items elsewhere on the list
//        for(int i = 0; i < 5000; i++) {
//            list.add(0, i);
//        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);

    }

    private static void mapExample() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "Five");
        map.put(2, "Two");
        map.put(6, "Six");
        map.put(1, "One");
        map.put(3, "Three");

//        to get it from the hashtable, if there is no value with the given key
//        it will return null;
        String text = map.get(2);
        System.out.println(text);

//        going over a map values
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ":" + value);
        }

    }
}
