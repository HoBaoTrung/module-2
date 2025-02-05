package StackAndQueue.QueueUseArray;

public class MyQueue {
    protected int capacity, head, tail, currentSize;
    protected int[] queueArr;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        this.head = 0;
        this.tail = -1;
        this.currentSize = 0;
        this.queueArr = new int[capacity];
    }

    public boolean isQueueFull() {
        return (currentSize == capacity);
    }

    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full");

        } else {
            tail++;
            if (tail == capacity) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Pop operation done ! removed: " + queueArr[head]);
            head++;
            if (head == capacity) {
                head = 0;
            }
            currentSize--;
        }
    }
}
