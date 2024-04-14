package org.example.BubbleSearch;

public class Main {
    public static void main(String[] args) {
        // Bubble sort = compare elements and swap if not in order
        // Quadratic time O(n^2)

        int array[] = {9, 1, 2, 8, 7, 3, 6, 4, 5};
        
        bubbleSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
