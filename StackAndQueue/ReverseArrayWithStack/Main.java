package StackAndQueue.ReverseArrayWithStack;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    private static <T> void reverse(T[] arr){
        Stack<T> stack = new Stack<>();

        for(T t : arr){
            stack.push(t);
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = stack.pop();
        }
    }

    private static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        Character[] arr = new Character[str.length()];
        for(int i = 0 ; i < arr.length ; i++){
            stack.push(str.charAt(i));
        }
        String res = "";
        for(int i = 0 ; i < arr.length ; i++){
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));

        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
