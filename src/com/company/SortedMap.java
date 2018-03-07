package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMap {
    HashMap<Integer, String> hashMap = new HashMap<>();
//    two ways to have a sorted hashmap, same as
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "dog");
        map.put(6, "cat");
        map.put(1, "deer");
        map.put(2, "duck");
        map.put(0, "bison");
        map.put(5, "rat");

        for(Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }

}
