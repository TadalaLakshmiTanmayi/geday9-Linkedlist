package org.example;

public class SortedLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private int size;

    public SortedLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add elements while keeping the list sorted
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // If the list is empty or the new node is smaller than the head, insert at the beginning
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            // Otherwise, traverse the list to find the correct insertion point
            Node<T> current = head;
            while (current.next != null && current.next.data.compareTo(data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    // Method to display the sorted linked list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }
    public Node<T> getHead() {
        return head;
    }

    // Node class for the linked list
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
