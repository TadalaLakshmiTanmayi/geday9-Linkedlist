package org.example;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addattail(56);
        ll.addattail(30);
        ll.addattail(70);
        System.out.println("Before pop:");
        ll.display();
        ll.pop();
        System.out.println("After pop");
        ll.display();
    }
}