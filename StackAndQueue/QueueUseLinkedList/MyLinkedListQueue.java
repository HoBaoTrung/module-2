package StackAndQueue.QueueUseLinkedList;

public class MyLinkedListQueue {
    protected Node head;
    protected Node tail;
    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public Node dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}
