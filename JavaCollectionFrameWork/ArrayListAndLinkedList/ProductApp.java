package JavaCollectionFrameWork.ArrayListAndLinkedList;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        // Thêm một số sản phẩm mẫu
        manager.addProduct(new Product(1, "Laptop", 1200));
        manager.addProduct(new Product(2, "Điện thoại", 800));
        manager.addProduct(new Product(3, "Tablet", 500));

        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp theo giá (tăng dần)");
            System.out.println("7. Sắp xếp theo giá (giảm dần)");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;

                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    manager.editProductById(updateId, name, price);
                    break;

                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int deleteId = scanner.nextInt();
                    manager.removeProductById(deleteId);
                    break;

                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    manager.displayProducts();
                    break;

                case 5:
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    manager.displayProductsByName(name);
                    break;

                case 6:
                    manager.increaseProductByPrice();
                    break;

                case 7:
                    manager.decreaseProductByPrice();
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
