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
        linkedList.addattail(40);  // Add node with value 40
        linkedList.addattail(70);  // Add node with value 70
    }
    @Test
    public void testSearchFound() {
        assertTrue(linkedList.search(40));
    }
    @Test
    public void sizebeforedelete(){
        assertEquals(4,linkedList.size());
    }

    @Test
    public void testSearchAfterDelete(){
        linkedList.delete(40);
        assertFalse(linkedList.search(40));
    }
    @Test
    public void sizeafterDelete(){
        linkedList.delete(40);
        assertEquals(3,linkedList.size());
    }


}