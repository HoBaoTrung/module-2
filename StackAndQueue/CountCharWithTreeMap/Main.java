package StackAndQueue.CountCharWithTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toUpperCase();
        Map<Character, Integer> charCountMap = new TreeMap<>();
        for(char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
