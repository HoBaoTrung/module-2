package StringAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassCodeExample {
    private final static String CLASS_CODE_REGEX = "^[CAP][0-9]{4}[GHIK]{1}";
    public static void main(String[] args) {
        String []valid = {"C0223G", "A0323K"};
        String []invalid = {"M0318G", "P0323A"};
        Pattern p = Pattern.compile(CLASS_CODE_REGEX);

        for(String s : valid) {
            System.out.println(s + " is valid: " + p.matcher(s).matches());
        }
        for(String s : invalid) {
            System.out.println(s + " is valid: " + p.matcher(s).matches());
        }
    }
}
