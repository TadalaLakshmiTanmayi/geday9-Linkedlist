package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<Integer> linkedList;
    @BeforeEach
    public void setUp(){
        // Create a new LinkedList before each test
        linkedList = new LinkedList<>();
        linkedList.addattail(56);  // Add node with value 56
        linkedList.addattail(30);  // Add node with value 30
        linkedList.addattail(70);  // Add node with value 70
    }
    @Test
    public void testSearchFound() {
        assertTrue(linkedList.search(30));
    }
    @Test
    public void testSearchNotFound() {
        assertFalse(linkedList.search(20));
    }

}