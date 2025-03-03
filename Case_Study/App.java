package Case_Study;

import java.io.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name, phoneNumber, address, gender, group, email, dateOfBirth;
        
        ContactManager contacts = new ContactManager();
        contacts.add(new Contact("Lê Văn C", "0933221100", "Đà Nẵng", "Nam", "Đồng nghiệp", "c.le@example.com", "20-07-1988"));
        contacts.add(new Contact("Phạm Thùy D", "0977123456", "Hải Phòng", "Nữ", "Bạn bè", "d.pham@example.com", "03-03-1992"));
        contacts.add(new Contact("Hoàng Minh E", "0909111222", "Cần Thơ", "Nam", "Gia đình", "e.hoang@example.com", "10-10-1985"));
        contacts.add(new Contact("Nguyễn Văn A", "0987654321", "Hà Nội", "Nam", "Bạn bè", "a.nguyen@example.com", "01-01-1990"));
        contacts.add(new Contact("Dương Khánh J", "0988111222", "Vũng Tàu", "Nam", "Bạn bè", "j.duong@example.com", "05-08-1986"));
        contacts.add(new Contact("Lý Hải K", "0933445566", "Đồng Nai", "Nam", "Khách hàng", "k.ly@example.com", "30-11-1994"));
        contacts.add(new Contact("Trịnh Mỹ L", "0911552233", "Hà Nam", "Nữ", "Đồng nghiệp", "l.trinh@example.com", "14-02-1989"));
        contacts.add(new Contact("Trần Thị B", "0980654269", "TP. Hồ Chí Minh", "Nữ", "Gia đình", "b.tran@example.com", "15-05-1995"));
        contacts.add(new Contact("Đặng Quốc F", "0966778899", "Bình Dương", "Nam", "Khách hàng", "f.dang@example.com", "08-12-1993"));
        contacts.add(new Contact("Ngô Thị G", "0944112233", "Nha Trang", "Nữ", "Bạn bè", "g.ngo@example.com", "25-04-1997"));
        contacts.add(new Contact("Võ Văn H", "0922334455", "Huế", "Nam", "Đồng nghiệp", "h.vo@example.com", "17-09-1991"));
        contacts.add(new Contact("Bùi Thanh I", "0955667788", "Quảng Nam", "Nữ", "Gia đình", "i.bui@example.com", "22-06-1990"));
        int choice;
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
            System.out.println("1. Xem danh sách" +
                    "\n2. Thêm mới" +
                    "\n3. Sửa" +
                    "\n4. Xóa" +
                    "\n5. Tìm kiếm" +
                    "\n6. Sắp xếp" +
                    "\n7. Ghi vào file" +
                    "\n8. Đọc từ file" +
                    "\n0. Thoát");
            System.out.print("Chọn chức năng: ");
            try {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 0:
                        System.out.println("Thoát chương trình.");
                        sc.close();
                        return;
                    case 1:
                        contacts.display();
                        break;

                    case 2:
                        name = InputInfo.inputName();

                        phoneNumber = InputInfo.inputPhoneNumber();
                        while (!contacts.isUniquePhoneNumber(phoneNumber)) {
                            System.out.println("Số điện thoại đã tồn tại");
                            System.out.println("Vui lòng nhập lại");
                            phoneNumber = InputInfo.inputPhoneNumber();
                        }
                        address = InputInfo.inputAddress();
                        gender = InputInfo.inputGender();
                        group = InputInfo.inputGroup();

                        email = InputInfo.inputEmail();
                        while (!contacts.isUniqueEmail(email)) {
                            System.out.println("Email đã tồn tại");
                            System.out.println("Vui lòng nhập lại");
                            email = InputInfo.inputEmail();
                        }
                        dateOfBirth = InputInfo.inputDOB();

                        contacts.add(new
                                Contact(name, phoneNumber, address,
                                gender, group, email, dateOfBirth)
                        );
                        break;


                    case 3:
                        contacts.update();
                        break;

                    case 4:
                        contacts.remove();
                        break;

                    case 5:
                        System.out.print("Nhập số điện thoại hoặc họ tên: ");
                        String key = sc.nextLine();
                        List<Contact> result = contacts.searchFuzzy(key);
                        if (result.isEmpty()) {
                            System.out.println("Không tìm thấy kết quả trùng khớp");
                        } else {
                            for (Contact c : result) {
                                System.out.println(c);
                            }
                        }
                        break;
                    case 6:
                        contacts.sort();
                        break;

                    case 7:
                        contacts.writeCSV();
                        break;

                    case 8:
                        contacts.readCSV();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Lỗi: Vui lòng nhập số từ 0-8.");
                sc.nextLine(); // Xóa input lỗi
                choice = -1; // Tránh vòng lặp vô hạn
            }
        }
        while (choice != 0);

        sc.close();
    }
}
