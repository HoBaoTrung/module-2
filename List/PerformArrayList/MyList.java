package List.PerformArrayList;

import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void add(int index,E e){
        if(size == elements.length){
            ensureCapacity(size + 1); // Đảm bảo đủ dung lượng
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = e;
        size++;
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E remove(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }
        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i+1];
        }
        size--;
        return (E) elements[index];
    }

    public int size(){
        return size;
    }

    public MyList<E> clone() {
        MyList<E> clonedList = new MyList<>(elements.length);
        clonedList.size = this.size;
        clonedList.elements = Arrays.copyOf(this.elements, this.size);
        return clonedList;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == null ? elements[i] == null : o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    // Xóa toàn bộ danh sách
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public String toString(){
        return Arrays.toString(elements);
    }

}
