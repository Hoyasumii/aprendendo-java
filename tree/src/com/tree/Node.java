package com.tree;

public class Node<T> implements Comparable<T> {
    private T item;
    private Node<T> next0;
    private Node<T> next1;

    public Node(T item) {
        this.item = item;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext0() {
        return next0;
    }

    public void setNext0(Node<T> next0) {
        this.next0 = next0;
    }

    public Node<T> getNext1() {
        return next1;
    }

    public void setNext1(Node<T> next1) {
        this.next1 = next1;
    }

}
