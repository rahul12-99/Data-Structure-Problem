package com.datastructureproblem;

public class MyStackList<K> {
    MyLinkedList myLinkedList = new MyLinkedList();

    public void pushQueue(INode element) {
        myLinkedList.appendToLast(element);
    }

    public void printStack() {
        myLinkedList.printMyNodes();

    }

}
