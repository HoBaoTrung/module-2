package StackAndQueue.CountCharWithTreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static Map<Character, Integer> countCharacter(String str){
        str = str.toUpperCase();
        Map<Character, Integer> charCountMap = new TreeMap<>();
        for(char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        for (Map.Entry<Character, Integer> entry : countCharacter(str).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
