package org.example.Hashtable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // Hashtable => run-time complexity:
        // best case O(1)
        // worst case O(n)
        int initialCapacity = 10;

//        // Integers
//        Hashtable<Integer, String> hashtable = new Hashtable<>(initialCapacity);
//
//        hashtable.put(1, "one");
//        hashtable.put(2, "two");
//        hashtable.put(3, "three");
//        hashtable.put(4, "four");
//        hashtable.put(5, "five");
//
//        hashtable.remove(2);
//
//        for (Integer key : hashtable.keySet()) {
//            System.out.println(key.hashCode() % initialCapacity + "\t" + key + "\t:\t" + hashtable.get(key));
//        }

        // Strings
        Hashtable<String, String> hashtable = new Hashtable<>(initialCapacity);

        hashtable.put("1", "one");
        hashtable.put("2", "two");
        hashtable.put("3", "three");
        hashtable.put("4", "four");
        hashtable.put("5", "five");

//        hashtable.remove("2");

        for (String key : hashtable.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t:\t" + hashtable.get(key));
        }
    }
}
