package com.problemsolving.scratches.datastructures.linkedlist;

public class MyLinkedList {
    static class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    Node head = null;

    public MyLinkedList() {

    }

    public int get(int index) {
        if(head == null) return -1;
        Node n = head;
        int i = 0;
        for(i = 0; i < index && n.next != null; i++ ){
            n = n.next;
        }
        if(i == index) return n.val;
        return -1;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        if(head == null){
            head = n;
        } else{
            n.next = head;
            head = n;
        }

    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if(head == null){
            addAtHead(val);
            return;
        }
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = n;
    }

    public void addAtIndex(int index, int val) {
        Node n = new Node(val);
        Node t = head;
        if(index == 0){
            n.next = head;
            head = n;
            return;
        }
        int i;
        for(i = 0; i < index - 1 ; i++){
            if(t.next != null){
                t = t.next;
            }
        }

        if(i == index - 1 && t.next != null){
            Node p = t.next;
            t.next = n;
            n.next = p;
        }
        if(t.next == null){
            t.next = n;
        }

    }

    public void deleteAtIndex(int index) {
        Node t = head;
        if(index == 0){
            head = t.next;
            return;
        }
        for(int i = 0; i < index - 1; i++){
            t = t.next;
        }
        if(t == null){
            return;
        }
        if(t.next != null){
            t.next = t.next.next;
        } else{
            t.next = null;
        }
    }
}
