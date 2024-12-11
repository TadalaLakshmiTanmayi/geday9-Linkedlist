package org.example;
public class Main {
    public static void main(String[] args) {
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(56);
        sortedLinkedList.add(30);
        sortedLinkedList.add(40);
        sortedLinkedList.add(70);
        System.out.print("Sorted Linkedlist: ");
        sortedLinkedList.display();

    }
}