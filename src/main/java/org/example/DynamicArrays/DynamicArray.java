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
        if(size == capacity) {
            grow();
        }
        array[size] = o;
        size++;
    }

    public void insert(int index, Object o) {

    }

    public void delete(Object o) {

    }

    public int search(Object o) {
        return -1;
    }

    public void grow() {

    }

    public void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for(int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
