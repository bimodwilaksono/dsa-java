package org.example;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntro {
    public static void main(String[] args) {

//        Priority Queue = a FIFO data structure that serves elements
//                with the highest priorities first
//                before elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("D");
        queue.offer("F");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
