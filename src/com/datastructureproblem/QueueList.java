package com.datastructureproblem;

public class QueueList {
    public static void main(String[] args) {

        MyStackList myQueue = new MyStackList();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.pushQueue(myFirstNode);
        myQueue.pushQueue(mySecondNode);
        myQueue.pushQueue(myThirdNode);
        myQueue.dequeue();

        myQueue.printStack();
    }
}
