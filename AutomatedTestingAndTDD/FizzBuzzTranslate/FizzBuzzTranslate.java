package AutomatedTestingAndTDD.FizzBuzzTranslate;

public class FizzBuzzTranslate {
    private static final String[] soHangDonVi = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] soHangChuc = {
            "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi",
            "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"
    };
    public static String traslate(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        return result.length() > 0 ? result : number + "";
    }

    public static String readToWord(int number) {
        if (number < 0 || number >= 100) {
            return "Số phải nằm trong khoảng từ 0 đến 99.";
        }

        if (number < 10) {
            return soHangDonVi[number]; // Đọc số nhỏ hơn 10
        } else {
            int hangChuc = number / 10; // Lấy hàng chục
            int hangDonVi = number % 10; // Lấy hàng đơn vị
            if (hangDonVi == 0) {
                return soHangChuc[hangChuc];
            } else {
                if(hangDonVi == 1) return soHangChuc[hangChuc] + " mốt";
                else if(hangDonVi == 5) return soHangChuc[hangChuc] + " lăm";
                return soHangChuc[hangChuc] + " " + soHangDonVi[hangDonVi];
            }
        }
    }
}
