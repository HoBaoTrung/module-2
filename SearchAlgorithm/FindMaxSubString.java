package SearchAlgorithm;

import java.util.LinkedList;
import java.util.List;

public class FindMaxSubString {
    public static void main(String[] args) {
        String text = "Welcome abcdef";
        List<Character> max = new LinkedList<Character>();
        for (int i = 0; i < text.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(text.charAt(i));
            for(int j = i+1; j < text.length(); j++) {
                if (text.charAt(j) > list.getLast()) {
                    list.add(text.charAt(j));
                }else break;
            }
            if (list.size() > max.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}
