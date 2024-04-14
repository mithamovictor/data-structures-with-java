package org.example.DynamicArrays;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object o) {
        if (size == capacity) {
            grow();
        }
        array[size] = o;
        size++;
    }

    public void insert(int index, Object o) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
        size++;
    }

    public void delete(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
