package StackAndQueue.StackUseArray;

public class MyStack {
    protected int[] arr;
    protected int size, index = -1;

    public MyStack(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++index] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[index--];
    }

    public int size(){
        return index+1;
    }

    public boolean isEmpty() {
        return index < 0;
    }

    public boolean isFull() {
        return index == size - 1;
    }

}
