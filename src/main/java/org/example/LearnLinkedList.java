package org.example;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");

        System.out.println(linkedList.indexOf("D"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);
    }
}
