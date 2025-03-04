package StringAndRegex;

import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_NUMBER_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
    public static void main(String[] args) {
        String []valid = {"(84)-(0978489648)"};
        String[] invalid = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        Pattern p = Pattern.compile(PHONE_NUMBER_REGEX);
        for (String s : valid) {
            System.out.println(s + " is valid: " + p.matcher(s).matches());
        }
        for (String s : invalid) {
            System.out.println(s + " is valid: " + p.matcher(s).matches());
        }
    }
}
