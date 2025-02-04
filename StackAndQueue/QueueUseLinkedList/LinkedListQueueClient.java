package StackAndQueue.QueueUseLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued item is " + queue.dequeue().key);//10
        queue.dequeue();//20 -> queue empty
        queue.dequeue();//
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);//lấy 30 -> còn lại 40, 50
    }
}
