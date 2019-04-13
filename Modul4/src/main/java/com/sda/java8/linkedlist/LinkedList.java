package com.sda.java8.linkedlist;

public class LinkedList {

    private Node head;

    // Adds new node to the list
    void add (Node node){
        // Test if null
        if (head == null){
            head = node;
            return;
        }
        Node parcurge = head;
        while(parcurge.getNextElement()!= null){
            parcurge = parcurge.getNextElement();
        }
        parcurge.setNextElement(node);
        // parcurge = head
        // while parcurge has a next element
        //      parcurge becomes parcurge.next
        // parcurge.next = node


    }
    // Displays all elements values of the list separated by space
    String print(){
//        String elemente = "";
        StringBuilder builder = new StringBuilder();
        for(Node nodCurent = head ; nodCurent != null;
        nodCurent = nodCurent.getNextElement()){
            builder.append(nodCurent.getValue());
            builder.append(" ");

        }
        return builder.toString();
//        Node parcurge = head;
//        while(parcurge.getNextElement()!= null){
//            System.out.println(parcurge.getValue());
//        }

//        return elemente;
    }
}
