package org.example;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addattail(56);
        linkedList.addattail(30);
        linkedList.addattail(70);

        System.out.println("Original Linked List:");
        linkedList.display();

        // Insert 40 after 30
        linkedList.insertAfter(30, 40);

        System.out.println("\nLinked List after inserting 40 after 30:");
        linkedList.display();
        linkedList.delete(40);

        System.out.println("\nLinked List after deleting 40:");
        linkedList.display();  // Display the list after deletion: 56 -> 30 -> 70

        // Display the size of the list
        System.out.println("\nSize of Linked List: " + linkedList.size());
    }
}