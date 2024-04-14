package org.example.SelectionSort;

public class Main {
    public static void main(String[] args) {
        // Selection sort => Quadratic time O(n^2)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
