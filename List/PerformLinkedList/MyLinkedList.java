package List.PerformLinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index,E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " , length " + numNodes);
        }
        Node newNode = new Node(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else{
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(E e) {
        add(0,e);
    }

    public void addLast(E e) {
        add(numNodes,e);
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node removeNode;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        }else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = removeNode.next;
        }
        numNodes--;
        return (E)removeNode.getData();
    }

    public boolean remove(Object o) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.getData().equals(o)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                numNodes--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            clone.addLast((E) current.getData());
            current = current.next;
        }
        return clone;
    }

    public boolean contains(E o) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }
        Node current = head;
        for (int index = 0; index < i; index++) {
            current = current.next;
        }
        return (E) current.getData();
    }

    public E getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return (E) head.getData();
    }

    public E getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return (E) current.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public void print(){

        Node current = head;
        while (current != null) {
            System.out.print(current.getData()+" ");
            current = current.next;
        }
        System.out.println();
    }
}
