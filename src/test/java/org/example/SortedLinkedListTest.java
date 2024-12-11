package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListTest {
    private SortedLinkedList<Integer> sortedLinkedList;

    @BeforeEach
    public void setUp() {
        // Create a new SortedLinkedList before each test
        sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(56);  // Add node with value 56
        sortedLinkedList.add(30);  // Add node with value 30
        sortedLinkedList.add(40);  // Add node with value 40
        sortedLinkedList.add(70);  // Add node with value 70
    }

    @Test
    public void testSortedList() {
        // Verify the list is sorted correctly: 30 -> 40 -> 56 -> 70
        StringBuilder sb = new StringBuilder();
        SortedLinkedList.Node<Integer> current = sortedLinkedList.getHead();
        while (current != null) {
            sb.append(current.data).append("->");
            current = current.next;
        }
        sb.append("null");

        assertEquals("30->40->56->70->null", sb.toString());
    }

}