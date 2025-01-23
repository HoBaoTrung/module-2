package AutomatedTestingAndTDD.NextDayCalculator;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            int[] nextDay = calculateNextDay(day, month, year);
            return String.format("%02d/%02d/%d", nextDay[0], nextDay[1], nextDay[2]);
        }
        return "Invalid Date";
    }

    private static int[] calculateNextDay(int day, int month, int year) {
        int daysInMonth = getDaysInMonth(month, year);
        if (day < daysInMonth) {
            day++;
        }else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        return new int[] { day, month, year };
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12) return false;

        int daysInMonth = getDaysInMonth(month, year);
        return day >= 1 && day <= daysInMonth;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
