package com.example.myapplication;

import androidx.annotation.Nullable;

/**
 *
 * @author lutellie
 */
public class Node {
    private Object data;
    private Node next;
    
    public Node(){
        data = null;
        next = null;
    }
    
    public Node(Object data){
        this.data = data;
        next = null;
    }
    
        // Accessor methods:
    public Object getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }

    // Modifier methods:
    public void setData(Object newData) {
        data = newData;
    }
    public void setNext(Node newNext) {
        next = newNext;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }
}
