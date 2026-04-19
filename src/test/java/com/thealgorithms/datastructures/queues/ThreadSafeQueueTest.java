package com.thealgorithms.datastructures.queues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ThreadSafeQueueTest {

	@Test
	void testQueueOperations() {
		ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>();

		assertTrue(queue.isEmpty());

		queue.enqueue(1);
		queue.enqueue(2);

		assertFalse(queue.isEmpty());

		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());

		assertTrue(queue.isEmpty());
	}

	@Test
	void testDequeueEmpty() {
		ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>();

		assertNull(queue.dequeue());
	}
}