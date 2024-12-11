package org.example;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addattail(56);
        ll.addattail(70);
        ll.insertAfter(56, 30);
        ll.display();
    }
}