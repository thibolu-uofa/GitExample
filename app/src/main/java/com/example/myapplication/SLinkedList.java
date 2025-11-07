package com.example.myapplication;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SLinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    public SLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void addFirst(Object data) {
        Node aNode = new Node(data); // create node
        aNode.setNext(head); // point to current head of list
        head = aNode; // set head to this node
        if (size == 0) {
            tail = head;
        }
        size += 1; // increment size
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node newHead){
        head = newHead;
    }

    public void addLast(Object data) {
        Node aNode = new Node(data); // create node
        if (size == 0) {
            addFirst(data);
            return;
        }
        tail.setNext(aNode); // make last node point to the new node
        tail = aNode; // update the tail pointer to the new node
        // make aNode point to null (already done in constructor)
        size += 1; // increment size
    }
    
    
    /**
     * Adds a node so that it becomes the ith node in the chain.
     * Does nothing if the index parameter is outside of the list range.
     * 
     * @param index - the location to put the new node into.
     * @param data - the data for the new node.
     */
    public void addIthNode(int index, Object data) {
        // edge cases
        if (index == 0) { // if index is 0, place at beginning
            addFirst(data);
            return;
        }
        if (size == index) { // if index is at the end of the list, place at end
            addLast(data);
            return;
        }
        if (index < 0 || index > size) { // if index out of range, return
            return;
        }
        
        Node newNode = new Node(data); // initialize the new node
        
        Node previousNode = head; // soon set to the node before i
        // iterate and find the (i - 1)th node
        for (int i = 0; i < index - 1; i++) {
            previousNode = previousNode.getNext();
        }
        Node followingNode = previousNode.getNext(); // the node after i
        // fit the new node into the chain by setting next values
        previousNode.setNext(newNode);
        newNode.setNext(followingNode);
        size++;
    }
    
    
    /**
     * Removes the first node from the list.
     * 
     * @return - the node that was removed.
     */
    public Node removeFirst() {
        Node tempNode = head;
        if (size == 0) {
            return null;
        }
        else {
            head = head.getNext();
            if (size == 1) {
                tail = null;
            }
        }
        size--;
        return tempNode;
    }
    
    
    /**
     * Removes the last node from the list.
     * 
     * @return - the node that was removed.
     */
    public Node removeLast() {
        Node tempNode = tail; // saving return value
        
        // edge cases
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return removeFirst();
        }
        
        // iterate and find the second last node
        Node secondLast = head;
        for (int i = 0; i < size - 2; i++) {
            secondLast = secondLast.getNext();
        }
        
        // remove the last node: set tail and the 'next' property
        tail = secondLast;
        secondLast.setNext(null);
        size--;
        
        return tempNode;
    }
    
    
    /**
     * removeIthNode: Delete the node at index ith
     * @return - The deleted node or null if no node was deleted.
     */
     public Node removeIthNode(int elemIdx)
     {
        if(elemIdx>= size)
            return null;
        if(elemIdx == size-1)
            return this.removeLast();
        if(elemIdx == 0)
            return this.removeFirst();
        // Find the node before the ith node
        Node before_ith_node = head;
        Node tempNode = before_ith_node.getNext();
        
        for(int i=0; i< elemIdx-1;i++){
            before_ith_node = before_ith_node.getNext();
        }
        // before ith node should point to ith +1
        before_ith_node.setNext(before_ith_node.getNext().getNext());
        
        return tempNode;
        // adding a comment
     }

     /**
    This is a toString method
    **/
    @Override
    public String toString(){

        String answer = "";
        Node walk = head;
        while (walk != null){
            answer = answer + walk.getData() + " "; 
            walk = walk.getNext();
        }
        return answer;
    }
    
}
