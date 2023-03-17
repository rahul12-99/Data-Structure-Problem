package com.datastructureproblem;

public class MyLinkedList {

    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void appendToLast(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insertAfterParticularNode(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void sortNode(INode previousNode, INode newNode) {
        if ((int) previousNode.getKey() < (int) newNode.getKey()) {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("-> ");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
