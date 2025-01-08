package Array;

public class CountCharInString {
    public static void main(String[] args) {
        char c = 'b';
        String str = "d1fg35df1gd3513dbd343df45d5f4b6df4b";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
