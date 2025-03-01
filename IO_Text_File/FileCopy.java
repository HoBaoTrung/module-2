package IO_Text_File;
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên tập tin nguồn
        System.out.print("Nhập tên tập tin nguồn: ");
        String sourceFileName = scanner.nextLine();
        File sourceFile = new File(sourceFileName);

        // Kiểm tra xem tập tin nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("Lỗi: Tập tin nguồn không tồn tại.");
            return;
        }

        // Nhập tên tập tin đích
        System.out.print("Nhập tên tập tin đích: ");
        String targetFileName = scanner.nextLine();
        File targetFile = new File(targetFileName);

        // Kiểm tra nếu tập tin đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Cảnh báo: Tập tin đích đã tồn tại. Bạn có muốn ghi đè? (y/n)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Hủy sao chép tập tin.");
                return;
            }
        }

        // Thực hiện sao chép tập tin
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {
            int byteCount = 0;
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
                byteCount++;
            }
            System.out.println("Sao chép hoàn tất. Số ký tự đã sao chép: " + byteCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tập tin: " + e.getMessage());
        }
    }
}
