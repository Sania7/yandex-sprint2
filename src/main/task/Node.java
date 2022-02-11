package main.task;

public class Node<N> {
    private N item;
    private Node<N> next;
    private Node<N> prev;

    public Node(N item, Node<N> next, Node<N> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public N getItem() {
        return item;
    }

    public void setItem(N item) {
        this.item = item;
    }

    public Node<N> getNext() {
        return next;
    }

    public void setNext(Node<N> next) {
        this.next = next;
    }

    public Node<N> getPrev() {
        return prev;
    }

    public void setPrev(Node<N> prev) {
        this.prev = prev;
    }
}
