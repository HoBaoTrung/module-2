package Case_Study;
import java.util.*;

public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
        // So sánh theo Tên (Last Name)
        int lastNameCompare = extractLastName(c1.getName()).compareTo(extractLastName(c2.getName()));
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        // Nếu trùng Tên, so sánh theo Tên lót (Middle Name)
        int middleNameCompare = extractMiddleName(c1.getName()).compareTo(extractMiddleName(c2.getName()));
        if (middleNameCompare != 0) {
            return middleNameCompare;
        }

        // Nếu trùng cả Tên lót, so sánh theo Họ (First Name)
        return extractFirstName(c1.getName()).compareTo(extractFirstName(c2.getName()));
    }

    // Lấy tên (Last Name) - phần cuối cùng trong họ tên
    private String extractLastName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        return parts[parts.length - 1];
    }

    // Lấy tên lót (Middle Name) - phần ở giữa
    private String extractMiddleName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length > 2) {
            return String.join(" ", Arrays.copyOfRange(parts, 1, parts.length - 1));
        }
        return ""; // Nếu không có tên lót, trả về chuỗi rỗng
    }

    // Lấy họ (First Name) - phần đầu tiên
    private String extractFirstName(String fullName) {
        return fullName.trim().split("\\s+")[0];
    }
}
