package com.datastructureproblem;

public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(null);

        if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)) {
            System.out.println("Creating LinkedList Condition is " + true);
        } else
            System.out.println("Creating LinkedListCondition is " + false);
    }
}
