package org.example;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {

//        ArrayList<String> arrayList = new ArrayList<>();

        DynamicArrayImpl dynamicArray = new DynamicArrayImpl();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
    }
}
