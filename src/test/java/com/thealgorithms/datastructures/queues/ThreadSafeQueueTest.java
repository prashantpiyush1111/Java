package com.thealgorithms.datastructures.queues;

public class ThreadSafeQueueTest {

    public static void main(String[] args) {

        ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                queue.enqueue(i);
                System.out.println("Enqueued: " + i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                Integer val = queue.dequeue();
                System.out.println("Dequeued: " + val);
            }
        });

        producer.start();
        consumer.start();
    }
}