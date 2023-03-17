package com.datastructureproblem;

public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList obj = new MyLinkedList();
        obj.addToFront(myFirstNode);
        obj.sortNode(myFirstNode,mySecondNode);
        obj.sortNode(mySecondNode,myThirdNode);

        MyNode<Integer> myNewNode = new MyNode<>(40);
        obj.insertAfterParticularNode(mySecondNode, myNewNode);

        obj.printMyNodes();

    }
}
