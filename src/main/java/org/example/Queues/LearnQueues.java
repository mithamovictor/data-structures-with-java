package org.example.Queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueues {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(1.0);
        queue.offer(3.4);
        queue.offer(2.7);
        queue.offer(4.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
