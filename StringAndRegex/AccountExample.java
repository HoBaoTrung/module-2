package StringAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
//        Pattern pattern = Pattern.compile(ACCOUNT_REGEX, Pattern.CASE_INSENSITIVE); Pattern.CASE_INSENSITIVE giúp không phân biệt hoa thường
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample;

        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde", "BgmjfrN"};

        accountExample = new AccountExample();
        for(String s : validAccount) {
            System.out.println(s + " is valid: " + accountExample.validate(s));
        }
        for(String s : invalidAccount) {
            System.out.println(s + " is not valid: " + accountExample.validate(s));
        }
    }
}
