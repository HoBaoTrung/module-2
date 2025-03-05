package KiemTraCuoiModule2;

import KiemTraCuoiModule2.Validator;

import static KiemTraCuoiModule2.App.scanner;
public abstract class InputInfo {
    
    static String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại:");
            phoneNumber = scanner.nextLine();
            if (!Validator.PhoneValidator(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ! Vui lòng nhập lại (Số điện thoại phải là 10 số và bắt đầu bằng 090 hoặc 091)");
            }
        } while (!Validator.PhoneValidator(phoneNumber));
        return phoneNumber;
    }


    static String inputDOB(){
        String dateOfBirth;
        do {
            System.out.print("Nhập ngày sinh (dd/mm/yyyy):");
            dateOfBirth = scanner.nextLine();
            if (!Validator.DateValidator(dateOfBirth)) {
                System.out.println("Ngày sinh không hợp lệ! Vui lòng nhập lại (VD: 15/12/2019)");
            }
        } while (!Validator.DateValidator(dateOfBirth));
        return dateOfBirth;
    }

    static String inputGender(){
        String gender;
        do {
            System.out.println("Chọn giới tính:");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.print("Nhập lựa chọn (1 hoặc 2): ");
            String c = scanner.nextLine();
            if ("1".equals(c)) {
                gender = "Nam";
                break;
            } else if ("2".equals(c)) {
                gender = "Nữ";
                break;
            } else {
                System.out.print("Lựa chọn không hợp lệ! Vui lòng chọn 1 hoặc 2.");
            }
        } while (true);
        return gender;
    }


    static String inputName() {
        do {
            System.out.print("Nhập họ tên:");
            String name = scanner.nextLine();
            if (!Validator.NameValidator(name)) {
                System.out.println("Yêu cầu nhập họ tên hợp lệ (4 đến 50 ký tự)");
            }else return name;
        }
        while (true);
    }

    static String inputClassID() {
        do{
            System.out.println("Nhập mã lớp:");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                System.out.println("Yêu cầu nhập mã lớp");
            }else return id;
        }while (true);

    }
}
