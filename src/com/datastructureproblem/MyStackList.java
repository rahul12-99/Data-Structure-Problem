package com.datastructureproblem;

public class MyStackList <K>{
    MyLinkedList myLinkedList = new MyLinkedList();
    public void push(INode element) {
        myLinkedList.addToFront(element);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirstNode();

    }

    public void printStack() {
        myLinkedList.printMyNodes();

    }

}
