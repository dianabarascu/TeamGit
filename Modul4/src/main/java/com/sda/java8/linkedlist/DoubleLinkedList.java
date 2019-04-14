package com.sda.java8.linkedlist;

public class DoubleLinkedList {

    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    // Adds new node to the list
    void add (DoubleLinkedNode node) {

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.setNextElement(node);
        node.setPreviousElement(tail);
        tail = node;//Nu se schimba tail, ci doar isi schimba adresa.

//        DoubleLinkedNode parcurge = head;
//
//        while (parcurge.getNextElement() != null) {
//            parcurge = parcurge.getNextElement();
//        }
//        parcurge.setNextElement(node);


    }

    void remove (int val) {
//        // Example remove last element if last contains only 2 values
//        if(head.getNextElement().getNextElement() == null){
//            head.setNextElement(null);
//        }

//        for (Node nodeCurent = head; nodeCurent.getNextElement().getValue()==val){
//            nodeCurent = nodeCurent.getNextElement();
//        }
        // if the list is empty, we stop.
        if(head == null) {
            return;
        }
        //if the first element is the value to remove, move the head to the next element
        if (head.getValue() == val){
            head = head.getNextElement();
            return;
        }
        // Walk the list until we pass through all elements or we find the value
        DoubleLinkedNode nodeCurent = head;

        while ((nodeCurent.getNextElement() != null) &&
                (nodeCurent.getNextElement().getValue() != val)) {
            nodeCurent = nodeCurent.getNextElement();
        }
        // if we didn't find the element, end.
        if (nodeCurent.getNextElement() == null){
            return;
        }
        //remove the element
        nodeCurent.setNextElement(nodeCurent.getNextElement().getNextElement());
    }

    // Displays all elements values of the list separated by space
    String print() {

        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");

        }
        return builder.toString();

    }
    String reversePrint() {

        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = tail; nodCurent != null; nodCurent = nodCurent.getPreviousElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");

        }
        return builder.toString();
    }
}
