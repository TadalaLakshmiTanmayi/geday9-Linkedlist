package org.example;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addattail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void addatbeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void insertAfter(T targetData, T newData) {
        Node<T> current = head;
        // Traverse the list to find the target node
        while (current != null && !current.data.equals(targetData)) {
            current = current.next;
        }

        if (current != null) {  // If the target node is found
            Node<T> newNode = new Node<>(newData);  // Create a new node with the given data
            newNode.next = current.next;  // Link the new node to the next node of the target node
            current.next = newNode;  // Link the target node to the new node
            size++;
        } else {
            System.out.println("Node with data " + targetData + " not found.");
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }
}