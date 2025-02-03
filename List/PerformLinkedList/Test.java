package List.PerformLinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");
        list.add(1, "D");

        System.out.println("List size: " + list.size());
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));
        list.print();
        list.remove("A");
        System.out.print("After removal: " );
        list.print();
        System.out.println("After removal, size: " + list.size());

        list.clear();
        System.out.println("After clearing, size: " + list.size());
    }
}
