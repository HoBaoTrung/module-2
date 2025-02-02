package List.PerformArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        // Thêm phần tử
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add(1, "D");

        System.out.println("Danh sách sau khi thêm phần tử:");
        System.out.println(myList);

        // Kiểm tra clone()
        MyList<String> clonedList = myList.clone();
        System.out.println("Danh sách đã clone:");
        for (int i = 0; i < clonedList.size(); i++) {
            System.out.print(clonedList.get(i) + " ");
        }
        System.out.println();
        clonedList.add("A");
        System.out.println(clonedList);
        System.out.println(myList);
    }
}
