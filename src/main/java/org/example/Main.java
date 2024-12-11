package org.example;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addattail(56);
        ll.addattail(30);
        ll.addattail(70);
        boolean found = ll.search(30);
        if (found) {
            System.out.println("Node with value 30 found.");
        } else {
            System.out.println("Node with value 30 not found.");
        }
    }
}