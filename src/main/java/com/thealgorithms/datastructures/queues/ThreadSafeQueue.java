package com.thealgorithms.datastructures.queues;

public class ThreadSafeQueue<T> {

	private static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;

	public synchronized void enqueue(T data) {
		Node<T> newNode = new Node<>(data);

		if (tail == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	public synchronized T dequeue() {
		if (head == null) {
			return null;
		}

		T data = head.data;
		head = head.next;

		if (head == null) {
			tail = null;
		}

		return data;
	}

	public synchronized boolean isEmpty() {
		return head == null;
	}
}
