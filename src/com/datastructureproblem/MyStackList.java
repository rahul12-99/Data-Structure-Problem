package com.datastructureproblem;

public class MyStackList <K>{
    MyLinkedList myLinkedList = new MyLinkedList();
    public void push (INode element){
        myLinkedList.addToFront(element);
    }
    public void printStack(){
        myLinkedList.printMyNodes();
    }

}
