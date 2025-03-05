package KiemTraCuoiModule2;

import java.time.LocalDate;

public abstract class Validator {
    static final String PHONE_PATTERN = "^(090|091)\\d{7}$";
    static final String NAME_PATTERN = "^[A-Za-zÀ-Ỹà-ỹ ]{4,50}$";
    static final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
    static final int currentYear = LocalDate.now().getYear(); // 2025
    public static boolean PhoneValidator(String phone) {
        return phone != null && phone.matches(PHONE_PATTERN);
    }

    public static boolean NameValidator(String name) {
        return name != null && name.matches(NAME_PATTERN);
    }

    public static boolean DateValidator(String date) {
        if (date == null || !date.matches(DATE_PATTERN)) {
            return false;
        }

        try {
            String[] parts = date.split("/");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            // Kiểm tra năm phải trước currentYear - 18
            if (year >= currentYear - 18 || year <= currentYear - 100) {
                return false;
            }

            // Kiểm tra tháng 2 và năm nhuận
            if (month == 2) {
                boolean isLeap = isLeapYear(year);
                if (day > (isLeap ? 29 : 28)) {
                    return false;
                }
            }
            // Kiểm tra số ngày trong các tháng
            else if (day > daysInMonth(month, year)) {
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Kiểm tra năm nhuận
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Số ngày trong tháng
    static int daysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

}
