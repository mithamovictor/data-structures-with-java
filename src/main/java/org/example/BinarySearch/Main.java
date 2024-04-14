package org.example.BinarySearch;

import java.util.Arrays;

public class Main {
//    this takes time complexity of o(log n)
    public static void main(String[] args) {
        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1) {
            System.out.println(target + " is not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = array[mid];

            System.out.println("middle value is " + midVal);

            if (midVal < target) low = mid + 1;
            else if (midVal > target) high = mid - 1;
            else return mid; // Target found
        }
        return -1; // Target not found
    }
}
