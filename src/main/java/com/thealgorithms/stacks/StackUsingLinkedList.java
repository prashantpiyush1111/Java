package com.thealgorithms.stacks;

/**
 * A class that implements a Stack using a singly linked list.
 * Supports basic operations like push, pop, peek, and isEmpty.
 *
 * Reference: https://www.geeksforgeeks.org/stack-using-linked-list/
 */
public class StackUsingLinkedList {

    /**
     * Node class representing each element in the stack
     */
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    /**
     * Push an element onto the stack
     *
     * @param value the value to push
     */
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    /**
     * Remove and return the top element of the stack
     *
     * @return top element
     */
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    /**
     * Return the top element without removing it
     *
     * @return top element
     */
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    /**
     * Check if the stack is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }
}
