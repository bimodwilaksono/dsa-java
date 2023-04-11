package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
        // Queue is FIFO data structures. First In First Out
        // A collection designed for holding elements prior to processing
        // Linear Data Structure

        // add = enqueue, offer() => add to end of queue
        // remove = dequeue, poll() => remove on the head of queue
        Queue<String> queue = new LinkedList<String>();

        //Where are queues useful?

//        1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
//        2. Printer Queue (Print Joobs should be comopleted in order)
//        3. Used in LinkedList, PriorityQueue, Breadth-first search
    }
}
