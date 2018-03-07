package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void checkSets() {
        Set<String > set1 = new HashSet<>();
        Set<String > treeSet = new TreeSet<>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("elephant");
        set1.add("elephant");
        set1.add("elephant");
//        set will only store unique data and will ignore adding elephants

        System.out.println(set1);

//        Iteration on the Set
        for (String element: set1) {
            System.out.println(element + " iterate from a set");
        }

//        Set is optomize for finding particular items quickly
        if (set1.contains("aardvark")) {
            System.out.println("it contains aardvark");
        } else {
            System.out.println("it does not contains aardvark");
        }

        if (set1.contains("snake")) {
            System.out.println("it contains a snake");
        } else {
            System.out.println("it does not contains snake");
        }


    }
}
