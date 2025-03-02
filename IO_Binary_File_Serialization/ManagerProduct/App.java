package IO_Binary_File_Serialization.ManagerProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = ProductManager.readProductsFromFile();

        while (true) {
            System.out.println("\n--- QUẢN LÝ SẢN PHẨM ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();

                    products.add(new Product(id, name, price, manufacturer, description));
                    ProductManager.writeProductsToFile(products);
                    break;

                case 2:
                    products = ProductManager.readProductsFromFile();
                    if (products.isEmpty()) {
                        System.out.println("Danh sách sản phẩm trống.");
                    } else {
                        System.out.println("\nDanh sách sản phẩm:");
                        for (Product p : products) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    String searchId = scanner.nextLine();
                    Product foundProduct = ProductManager.searchProductById(searchId);
                    if (foundProduct != null) {
                        System.out.println("Sản phẩm tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

