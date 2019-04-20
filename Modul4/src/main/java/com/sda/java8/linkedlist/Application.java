package com.sda.java8.linkedlist;

public class Application {

    public static void main (String[] args){

      singleLinkedList();
//        doubleLinkedList();


    }

    private static void doubleLinkedList() {
        DoubleLinkedNode node1 = new DoubleLinkedNode(20);
        DoubleLinkedNode node2 = new DoubleLinkedNode(40);
        DoubleLinkedNode node3 = new DoubleLinkedNode(30);
        DoubleLinkedNode node4 = new DoubleLinkedNode(50);
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        System.out.println(list.print());
        //  System.out.println(list.reversePrint());

        list.remove(40);
        System.out.println(list.print());
        System.out.println(list.reversePrint());
        list.remove(50);
        System.out.println(list.print());
        System.out.println(list.reversePrint());
    }

    private static void singleLinkedList() {
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(30);

        LinkedList list = new LinkedList();

        list.addInOrder(100);
        list.addInOrder(300);
        list.addInOrder(200);
        list.addInOrder(150);

        System.out.println(list.print());


//        list.remove(40);
//        System.out.println(list.print());
//        list.remove(20);
//        System.out.println(list.print());
//        list.remove(50);
//        System.out.println(list.print());
//        list.remove(30);
//        System.out.println(list.print() +  "Ultimul");
    }
}
