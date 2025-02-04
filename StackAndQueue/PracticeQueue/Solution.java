package StackAndQueue.PracticeQueue;

public class Solution {
    Queue queue = new Queue();
    public void enQueue(int x) {
        Node newNode = new Node(x);
        if (queue.rear == null) {
            queue.rear = newNode;
            queue.front = newNode;
        }else{
            queue.rear.link = newNode;
            queue.rear = newNode;
        }
    }

    public int deQueue() {
        int result = -1;
        if (queue.front != null) {
            result = queue.front.data;
            queue.front = queue.front.link;
        }
        if (queue.front == null) {
            queue.rear = null;
        }
        return result;
    }

    public void displayQueue() {
        if (queue.front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node current = queue.front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.enQueue(10);
        solution.enQueue(20);
        solution.enQueue(30);

        solution.displayQueue(); // Kết quả: Queue: 10 20 30

        solution.deQueue();
        solution.displayQueue(); // Kết quả: Queue: 20 30

        solution.deQueue();
        solution.deQueue();
        solution.displayQueue(); // Kết quả: Queue is empty!
    }
}
