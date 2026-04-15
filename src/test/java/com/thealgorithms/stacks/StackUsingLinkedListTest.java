package com.thealgorithms.stacks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test class for StackUsingLinkedList.
 *
 * This class contains unit tests to verify the correctness of stack operations
 * such as push, pop, peek, and isEmpty.
 *
 * Reference: https://www.geeksforgeeks.org/stack-using-linked-list/
 */
class StackUsingLinkedListTest {

	/**
	 * Test push and pop operations
	 */
	@Test
	void testPushAndPop() {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);

		assertEquals(20, stack.pop());
		assertEquals(10, stack.pop());
	}

	/**
	 * Test peek operation
	 */
	@Test
	void testPeek() {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);

		assertEquals(5, stack.peek());
	}

	/**
	 * Test isEmpty method
	 */
	@Test
	void testIsEmpty() {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		assertTrue(stack.isEmpty());
		stack.push(1);
		assertFalse(stack.isEmpty());
	}

	/**
	 * Test pop on empty stack (edge case)
	 */
	@Test
	void testPopOnEmptyStack() {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		assertThrows(RuntimeException.class, stack::pop);
	}

	/**
	 * Test peek on empty stack (edge case)
	 */
	@Test
	void testPeekOnEmptyStack() {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		assertThrows(RuntimeException.class, stack::peek);
	}
}