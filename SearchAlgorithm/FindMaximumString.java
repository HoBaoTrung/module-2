package SearchAlgorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) { // {1}
            char c = str.charAt(i);
            if (list.size() > 0 && list.contains(c) && c < list.getLast()) {
              list.clear();
            }
            list.add(c);
            if (list.size() >= max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for(char c : max) { //{2}
            System.out.print(c);
        }
    }
}
/*
* Vòng lặp 1 sẽ lặp lặi số lần bằng với chiều dài của chuỗi
* Vì độ dài của max sẽ <= độ dài chuỗi
* ==> độ phức tạp thuật toán sẽ phụ thuộc vào vòng lặp {1} = O(n)
* */