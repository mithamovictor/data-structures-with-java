package org.example.MergeSort;

public class Main {
     public static void main(String[] args) {
         // Merge sort => Quasilinear time
         // run-time complexity O(n log n)
         // space complexity O(n)

         int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

         mergeSort(array);
         
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
         }
     }

    private static void mergeSort(int[] array) {
         int length = array.length;
         if (length <= 1) return; // base case
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if(i < middle) {
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] leftArr, int[] rightArr) {
         int leftSize = array.length / 2;
         int rightSize = array.length - leftSize;
         int i=0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                array[i] = leftArr[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[r] = rightArr[r];
            i++;
            r++;
        }
    }
}
